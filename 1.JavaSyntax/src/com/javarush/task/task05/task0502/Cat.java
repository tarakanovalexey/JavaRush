package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (this.age+2*this.weight+6*this.strength>anotherCat.age+2*anotherCat.weight+6*anotherCat.strength)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

    }
}
