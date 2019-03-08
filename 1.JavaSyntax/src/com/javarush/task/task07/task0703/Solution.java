package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String[] sarray = new String[10];
        int[] iarray = new int[10];
        for (int i = 0; i < 10; i++){
            sarray[i] = R.readLine();
            iarray[i] = sarray[i].length();
            System.out.println(iarray[i]);
        }
    }
}
