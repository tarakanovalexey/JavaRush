package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        if (clock.isAlive()) {
            clock.interrupt();
            System.out.println("Прервано!");
        }
        else {
            System.out.println("Марш!");
            clock.interrupt();
        }

    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            for (int i = numSeconds; i > 0; i--) {
                System.out.print(numSeconds+" ");
                try {Thread.sleep(1000);}
                catch (InterruptedException e) {}
                numSeconds--;
            }
        }
    }
}
