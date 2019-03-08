package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(R.readLine());
            count = count > strings.get(i).length() ? count : strings.get(i).length();
        }
        for (int i = 0; i < 5; i++)
            if (count == strings.get(i).length())
                System.out.println(strings.get(i));
    }
}
