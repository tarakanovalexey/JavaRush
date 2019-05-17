package com.javarush.task.task30.task3008;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Server {

    private static Map<String, Connection> connectionMap = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(ConsoleHelper.readInt())) {
            System.out.println("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept();
                Handler handler = new Handler(socket);
                handler.start();
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка!");
        }
    }

    public static void sendBroadcastMessage(Message message) {
        for (Map.Entry<String, Connection> each : connectionMap.entrySet()){
            try {
                each.getValue().send(message);
            } catch (IOException e) {
                System.out.println("Ошибка!");
            }
        }
    }

    private static class Handler extends Thread {
        private Socket socket;

        public Handler(Socket socket) {
            this.socket = socket;
        }

        private String serverHandshake(Connection connection) throws IOException, ClassNotFoundException {
            String userName;
            while (true) {
                connection.send(new Message(MessageType.NAME_REQUEST, "Введите ваше имя:"));
                Message message = connection.receive();
                userName = message.getData();
                if (!message.getType().equals(MessageType.USER_NAME))
                    continue;
                if (userName.isEmpty()) {
                    connection.send(new Message(MessageType.TEXT, "Ошибка! Имя не может быть пустым."));
                    continue;
                }
                if (connectionMap.containsKey(userName)) {
                    continue;
                }
                break;
            }
            connectionMap.put(userName, connection);
            connection.send(new Message(MessageType.NAME_ACCEPTED, "Имя "+userName+" успешно установлено"));
            return userName;
        }

        private void notifyUsers(Connection connection, String userName) throws IOException {
            for (Map.Entry<String, Connection> each : connectionMap.entrySet()){
                try {
                    if (!each.getKey().equals(userName))
                    connection.send(new Message(MessageType.USER_ADDED, each.getKey()));
                } catch (IOException e) {
                    ConsoleHelper.writeMessage("Ошибка!");
                }
            }
        }

        private void serverMainLoop(Connection connection, String userName) throws IOException, ClassNotFoundException {
            Message message;
            while (true) {
                message = connection.receive();
                if (message.getType() == MessageType.TEXT) {
                    sendBroadcastMessage(new Message(MessageType.TEXT, userName + ": " + message.getData()));
                } else ConsoleHelper.writeMessage("Ошибка!");
            }
        }

        public void run() {
            ConsoleHelper.writeMessage("Установлено соединение "+socket.getRemoteSocketAddress().toString());
            String userName = "";
            try (Connection connection = new Connection(socket);) {
                userName = serverHandshake(connection);
                sendBroadcastMessage(new Message(MessageType.USER_ADDED, userName));
                notifyUsers(connection, userName);
                serverMainLoop(connection, userName);
            } catch (IOException e) {
                ConsoleHelper.writeMessage("Ошибка! IOException");
            } catch (ClassNotFoundException e) {
                ConsoleHelper.writeMessage("Ошибка! ClassNotFoundException");
            }
            sendBroadcastMessage(new Message(MessageType.USER_REMOVED, userName));
            connectionMap.remove(userName);
        }
    }
}
