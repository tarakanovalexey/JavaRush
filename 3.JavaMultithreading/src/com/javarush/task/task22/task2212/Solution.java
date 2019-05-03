package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null || telNumber.isEmpty())
            return false;
        int counter = 0;
        for (Character each: telNumber.toCharArray()) {
            if (String.valueOf(each).matches("\\d"))
                counter++;
        }
        if ((String.valueOf(telNumber.charAt(0)).equals("+") && counter == 12) ||
            (String.valueOf(telNumber.charAt(0)).matches("\\d") && counter == 10))
        if ( telNumber.matches("\\+?\\d*\\(?\\d{3}\\)?[-]?[\\d]+[-]?[\\d]+"))
            return true;

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+380501234567"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("+38050123-45-67"));
        System.out.println(checkTelNumber("050123-4567"));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("+38(050)1-23-45-6-7"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));

    }
}
