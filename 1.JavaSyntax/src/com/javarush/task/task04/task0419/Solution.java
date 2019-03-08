package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        int a = Integer.parseInt(text);
        text = R.readLine();
        int b = Integer.parseInt(text);
        text = R.readLine();
        int c = Integer.parseInt(text);
        text = R.readLine();
        int d = Integer.parseInt(text);
        int x = a;
        if (x < b)
            x = b;
        if (x < c)
            x = c;
        if (x < d)
            x = d;
        System.out.print(x);
    }
}
