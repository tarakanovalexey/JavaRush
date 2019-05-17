package com.javarush.task.task30.task3008.client;


import com.javarush.task.task30.task3008.Connection;
import com.javarush.task.task30.task3008.ConsoleHelper;
import com.javarush.task.task30.task3008.Message;
import com.javarush.task.task30.task3008.MessageType;

import java.io.IOException;
import java.net.Socket;

public class Client {
    protected Connection connection;
    private volatile boolean clientConnected = false;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client client = new Client();
        client.run();
    }

    protected String getServerAddress() {
        return ConsoleHelper.readString();
    }

    public void run() throws IOException, ClassNotFoundException {
        SocketThread socketThread = getSocketThread();
        socketThread.setDaemon(true);
        socketThread.start();
        synchronized (this) {
            try{
                wait();
            } catch (Exception e){
                try {
                    connection.send(new Message(MessageType.TEXT, "Ошибка!"));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        if (shouldSendTextFromConsole())
        if (clientConnected)
            sendTextMessage("Соединение установлено. Для выхода наберите команду 'exit'.");
        else sendTextMessage("Произошла ошибка во время работы клиента. Just test");
        while (clientConnected){
            String text = ConsoleHelper.readString();
            if (text.equalsIgnoreCase("exit"))
                break;
            else if (shouldSendTextFromConsole())
                sendTextMessage(text);
        }
    }

    protected int getServerPort() {
        return ConsoleHelper.readInt();
    }

    protected boolean shouldSendTextFromConsole() {
        return true;
    }

    protected String getUserName(){
        return ConsoleHelper.readString();
    }

    protected SocketThread getSocketThread() {
        return new SocketThread();
    }

    protected void sendTextMessage(String text) {
        try {
            connection.send(new Message(MessageType.TEXT, text));
        } catch (IOException e) {
            clientConnected = false;
        }
    }



    public class SocketThread extends Thread {
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
        }
        protected void informAboutAddingNewUser(String userName){
            ConsoleHelper.writeMessage(userName+" присоединился к чату");
        }
        protected void informAboutDeletingNewUser(String userName){
            ConsoleHelper.writeMessage(userName+" покинул чат");
        }
        protected void notifyConnectionStatusChanged(boolean clientConnected){
            Client.this.clientConnected = clientConnected;
            synchronized (Client.this) {
                Client.this.notify();
            }
        }

        public void run() {
            String address = getServerAddress();
            int port = getServerPort();
            try {
                Socket socket = new Socket(address, port);
                connection = new Connection(socket);
                clientHandshake();
                clientMainLoop();
            } catch (IOException | ClassNotFoundException e) {
                notifyConnectionStatusChanged(false);
            }
        }

        protected void clientHandshake() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.NAME_REQUEST)
                    connection.send(new Message(MessageType.USER_NAME, getUserName()));
                else if (message.getType() == MessageType.NAME_ACCEPTED) {
                    notifyConnectionStatusChanged(true);
                    break;
                }
                else throw new IOException("Unexpected MessageType");
            }
        }

        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            while (true) {
                Message message = connection.receive();
                if (message.getType() == MessageType.TEXT)
                    processIncomingMessage(message.getData());
                else if (message.getType() == MessageType.USER_ADDED)
                    informAboutAddingNewUser(message.getData());
                else if (message.getType() == MessageType.USER_REMOVED)
                    informAboutDeletingNewUser(message.getData());
                else throw new IOException("Unexpected MessageType");
            }
        }
    }
}
