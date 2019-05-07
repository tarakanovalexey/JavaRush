package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/
public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (Thread thread : threads)
            switch (thread.getState().ordinal()) {
                case 0:
                    thread.start();
                    break;
                case 1:
                    thread.isInterrupted();
                    break;
                case 2:
                case 3:
                case 4:
                    thread.interrupt();
                    break;
                case 5:
                    System.out.println(thread.getPriority());
                    break;
            }
    }

    public static void main(String[] args) {
    }
}
