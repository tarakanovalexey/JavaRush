package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int x=1, i=1;
        while (i<=10) {
            while (x <= 10) {
                System.out.print(i*x+" ");
                x++;
            }
            i++;
            x=1;
            System.out.println();
        }
    }
}
