package com.javarush.task.task30.task3008.client;

import com.javarush.task.task30.task3008.ConsoleHelper;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class BotClient extends Client {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new BotClient().run();
    }

    @Override
    protected SocketThread getSocketThread() {
        return new BotSocketThread();
    }

    @Override
    protected boolean shouldSendTextFromConsole() {
        return false;
    }

    public String getUserName() {
        return "date_bot_"+ (int)((Math.random()*100));
    }

    public class BotSocketThread extends SocketThread {

        @Override
        protected void clientMainLoop() throws IOException, ClassNotFoundException {
            sendTextMessage("Привет чатику. Я бот. Понимаю команды: дата, день, месяц, год, время, час, минуты, секунды.");
            super.clientMainLoop();
        }

        @Override
        protected void processIncomingMessage(String message) {
            ConsoleHelper.writeMessage(message);
            if (message.contains(":")) {
                String userName = message.split(":")[0].trim();
                String userMessage = message.split(":")[1].trim();
                Map<String, String> formats = new HashMap<>();
                formats.put("дата", "d.MM.YYYY");
                formats.put("день", "d");
                formats.put("месяц", "MMMM");
                formats.put("год", "YYYY");
                formats.put("время", "H:mm:ss");
                formats.put("час", "H");
                formats.put("минуты", "m");
                formats.put("секунды", "s");
                formats.keySet().stream().filter(usMsg -> usMsg.equals(userMessage))
                        .forEach(s -> sendTextMessage(String.format("Информация для %s: %s",
                                userName, new SimpleDateFormat(formats.get(s)).format(Calendar.getInstance().getTime())
                        )));
            }

        }
    }
}
