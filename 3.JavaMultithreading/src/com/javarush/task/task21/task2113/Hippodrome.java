package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void move (){
        for (Horse each: getHorses()) {
            each.move();
        }
    }

    public void print (){
        for (Horse each: getHorses()) {
            each.print();
        }
        for (int i = 0; i<10; i++){
            System.out.println("");
        }

    }

    public void run(){
        for (int i = 0; i < 100; i++){
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public Horse getWinner(){
        Horse winner = getHorses().get(0);
        for (Horse each: getHorses()) {
           if (each.distance > winner.distance)
               winner = each;
        }
        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is "+getWinner().name+"!");
    }

    public static void main(String[] args) {
        List<Horse> list = new ArrayList<>();
        list.add(new Horse("Lucky", 3, 0));
        list.add(new Horse("Fedya", 3, 0));
        list.add(new Horse("Johnie", 3, 0));
        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }
}
