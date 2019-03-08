package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        int a = Integer.parseInt(text);
        if (a % 100 == 0 ^ a % 400 == 0 ^ a % 4 == 0)
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}