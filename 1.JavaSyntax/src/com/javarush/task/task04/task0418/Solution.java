package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        int a = Integer.parseInt(text);
        text = R.readLine();
        int b = Integer.parseInt(text);
        if (a==b)
            System.out.print(a);
        else
        {
            if (a<b)
                System.out.print(a);
            else
                System.out.print(b);
        }
    }
}