package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new myThread1());
        threads.add(new myThread2());
        threads.add(new myThread3());
        threads.add(new myThread4());
        threads.add(new myThread5());
    }

    public static void main(String[] args) {
    }

    public static class myThread1 extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++)
                i--;
        }
    }

    public static class myThread2 extends Thread {
        public void run() {
            if(this.isInterrupted())
                System.out.println("InterruptedException");
            }
        }

    public static class myThread3 extends Thread {
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {Thread.sleep(500);}
                catch (InterruptedException e) {}
            }
        }
    }

    public static class myThread4 extends Thread implements Message {

        public void run() {
            for (int i = 0; i < 10; i++)
                i--;
        }

        public void showWarning() {
            this.stop();
        }
    }

    public static class myThread5 extends Thread {
        public void run() {
            BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
            try {
                String text = R.readLine();
                int sum = 0;
                while (!text.equals("N")) {
                    sum += Integer.parseInt(text);
                    text = R.readLine();
                }
                System.out.println(sum);
            } catch (IOException e) {}
        }
    }
}