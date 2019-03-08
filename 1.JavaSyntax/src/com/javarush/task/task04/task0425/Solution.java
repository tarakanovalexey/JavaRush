package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String sa = R.readLine();
        String sb = R.readLine();
        int a = Integer.parseInt(sa);
        int b = Integer.parseInt(sb);
        if (a>0 && b>0)
            System.out.print("1");
        if (a<0 && b>0)
            System.out.print("2");
        if (a<0 && b<0)
            System.out.print("3");
        if (a>0 && b<0)
            System.out.print("4");
    }
}
