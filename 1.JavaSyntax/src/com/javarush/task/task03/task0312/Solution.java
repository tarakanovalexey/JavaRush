package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    //напишите тут ваш код

    public static int convertToSeconds(int hour) {
        hour = hour*3600;
        return hour;
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertToSeconds(145));
        System.out.print(convertToSeconds(56));
    }
}
