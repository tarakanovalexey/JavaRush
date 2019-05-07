package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    private Thread thread;
    private int status;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        System.out.println(thread.getState());
        thread.setDaemon(true);
        thread.run();
    }

    @Override
    public void run() {
        while (true) {
            if (status != thread.getState().ordinal()) {
                System.out.println(thread.getState());
                status = thread.getState().ordinal();
            }
            if (status == 5) {
                Thread.currentThread().stop();
                break;
            }
        }
    }
}
