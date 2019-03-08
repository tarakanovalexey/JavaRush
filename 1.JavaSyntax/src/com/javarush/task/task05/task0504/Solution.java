package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat murzik = new Cat("Muzrik",5,3,6);
        Cat pushok = new Cat("Pushok",2,1,3);
        Cat shezhok = new Cat("Snezhok", 7,4,5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}