package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int skill;
        private boolean sex;
        private Human parent;
        private Human grandparent;

        public Human(String name){
            this.name = name;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
            this.grandparent = null;
        }

        public Human(String name, int age, int skill){
            this.name = name;
            this.age = age;
            this.skill = skill;
            this.grandparent = null;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.grandparent = null;
        }

        public Human(String name, int age, int skill, boolean sex){
            this.name = name;
            this.age = age;
            this.skill = skill;
            this.sex = sex;
            this.grandparent = null;
        }

        public Human(String name, int age, int skill, boolean sex, Human parent){
            this.name = name;
            this.age = age;
            this.skill = skill;
            this.sex = sex;
            this.parent = parent;
        }

        public Human(String name, int age, int skill, Human parent){
            this.name = name;
            this.age = age;
            this.skill = skill;
            this.parent = parent;
        }

        public Human(String name, int age, int skill, Human grandparent, Human parent){
            this.name = name;
            this.age = age;
            this.skill = skill;
            this.parent = parent;
            this.grandparent = grandparent;
        }

        public Human(String name, boolean sex){
            this.name = name;
            this.sex = sex;
            this.grandparent = null;
        }

        public Human(String name, int skill, Human grandparent){
            this.name = name;
            this.skill = skill;
            this.grandparent = grandparent;
        }

    }
}
