package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
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
        int positive = 0 , negative = 0;
        if (a != 0) {
        if (a > 0)
            positive++;
        else negative++;}
        if (b != 0) {
        if (b > 0)
            positive++;
        else negative++; }
        if (c != 0) {
        if (c > 0)
            positive++;
        else negative++; }
        System.out.println("количество отрицательных чисел: "+negative);
        System.out.println("количество положительных чисел: "+positive);
    }
}
