package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        int a = Integer.parseInt(text);
        String check1, check2;
        if (a==0)
            System.out.print("ноль");
        else {
            if (a > 0) {
                if (a % 2 > 0)
                    check1 = "нечетное";
                else check1 = "четное";
            } else {
                if (-a % 2 > 0)
                    check1 = "нечетное";
                else check1 = "четное";
            }
            if (a > 0)
                check2 = "положительное";
            else check2 = "отрицательное";
            System.out.print(check2 + " " + check1 + " число");
        }
    }
}
