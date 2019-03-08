package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date x = new Date(date);
        Date y = new Date();
        y.setHours(0);
        y.setMinutes(0);
        y.setSeconds(0);
        y.setDate(1);
        y.setMonth(0);
        y.setYear(x.getYear());
        long z = x.getTime() - y.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        if (z / msDay % 2 != 0)
        return true;
        else return false;
    }
}
