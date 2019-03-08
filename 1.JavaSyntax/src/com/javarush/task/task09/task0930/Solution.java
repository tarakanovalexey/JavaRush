package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        String x = "";
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> numbers = new ArrayList<>();
        for(String each : array)
            if (isNumber(each))
                numbers.add(each);
            else strings.add(each);
        for(int j = 0; j< strings.size()-1; j++)
            for(int i = 0; i< strings.size()-1; i++)
                if (isGreaterThan(strings.get(i),strings.get(i+1))) {
                    x = strings.get(i + 1);
                    strings.set(i + 1, strings.get(i));
                    strings.set(i, x);
                }
        for(int j = 0; j< numbers.size()-1; j++)
            for(int i = 0; i< numbers.size()-1; i++)
                if (Integer.parseInt(numbers.get(i+1)) > Integer.parseInt(numbers.get(i))) {
                    x = numbers.get(i + 1);
                    numbers.set(i + 1, numbers.get(i));
                    numbers.set(i, x);
                }
        for(int i =0, s = 0, n = 0; i < array.length; i++)
            if (isNumber(array[i])) {
                array[i] = numbers.get(n);
                n++;
            }
            else {
                array[i] = strings.get(s);
                s++;
            }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
