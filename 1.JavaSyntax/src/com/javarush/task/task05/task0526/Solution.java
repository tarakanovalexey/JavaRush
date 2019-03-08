package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man = new Man("Aleksey", 26, "Filevskiy bulvar 23");
        Man man1 = new Man("Pasha", 25, "Filevskaya ul 3");
        Woman woman = new Woman("Anita", 27, "Filevskiy bulvar 23");
        Woman woman1 = new Woman("Katya", 26, "Filevskaya ul 3");
        System.out.println(man.name+" "+man.age+" "+man.address);
        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        System.out.println(woman.name+" "+woman.age+" "+woman.address);
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman{
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
