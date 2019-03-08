package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        int[] barray = new int[20];
        int[] sarray = new int[10];
        int[] carray = new int[10];
        for (int i = 0; i < 20; i++) {
            barray[i] = Integer.parseInt(R.readLine());
            if ( i < 10 )
                sarray[i] = barray[i];
            else carray[i-10] = barray[i];
        }
        for (int i = 0; i < 10; i++)
            System.out.println(carray[i]);
    }
}
