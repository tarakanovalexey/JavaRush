package com.javarush.task.task06.task0613;

/* 
Кот и статика
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Cat newcat = new Cat();
        }

        System.out.print(Cat.catCount);
    }

    public static class Cat {
        public static int catCount = 0;
        // Создай статическую переменную catCount

        // Создай конструктор
        public Cat(){
            this.catCount++;
        }

    }
}
