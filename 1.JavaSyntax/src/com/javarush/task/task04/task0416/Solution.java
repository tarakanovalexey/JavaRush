package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
        String text = t.readLine();
        double a = Double.parseDouble(text);
        a = a % 5;
        if (a>=0 && a<3)
            System.out.println("зелёный");
        if (a>=3 && a<4)
            System.out.println("жёлтый");
        if (a>=4 && a<5)
            System.out.println("красный");
    }
}