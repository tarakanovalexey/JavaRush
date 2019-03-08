package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        int a = Integer.parseInt(text);
        String check1, check2;
        int b = text.length();
        if (a % 2 == 0)
            check1 = "четное";
        else check1 = "нечетное";
        if (a >= 1 && a <=999) {
            check2 = "однозначное";
            if (b == 1)
                check2 = "однозначное";
            if (b == 2)
                check2 = "двузначное";
            if (b == 3)
                check2 = "трехзначное";
            System.out.print(check1 + " " + check2 + " число");
        }
    }
}
