package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        System.out.println(convertEurToUsd(100,0.79));
        System.out.println(convertEurToUsd(300,0.81));
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        double x;
        x = eur * course;
        return x;
    }
}
