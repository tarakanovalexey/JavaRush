package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String scheck = R.readLine();
        int check = Integer.parseInt(scheck);
        if (check == 0)
            System.out.println(check);
        if (check > 0)
            System.out.println(check*2);
        if (check < 0)
            System.out.println(check+1);
    }

}