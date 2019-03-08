package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String sa = R.readLine();
        String sb = R.readLine();
        String sc = R.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        int c = Integer.parseInt(sc);
        if (a>=b+c || b>=a+c || c>=a+b)
            System.out.println("Треугольник не существует.");
            else
                System.out.println("Треугольник существует.");
    }
}