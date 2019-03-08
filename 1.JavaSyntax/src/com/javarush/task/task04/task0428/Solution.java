package com.javarush.task.task04.task0428;

/* 
Положительное число
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
        int count = 0;
        if (a > 0)
            count++;
        if (b > 0)
            count++;
        if (c > 0)
            count++;
        System.out.print(count);
    }
}
