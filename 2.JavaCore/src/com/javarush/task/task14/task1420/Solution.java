package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(R.readLine());
        if (x <= 0) throw new Exception();
        int y = Integer.parseInt(R.readLine());
        if (y <= 0) throw new Exception();
        int small = 0;
        if (x<y) small = x;
        else small = y;
        for (int i = small; i > 0; i--)
            if (x % i == 0 && y % i == 0) {
                small = i;
                break;
            }
        System.out.println(small);
        R.close();
    }

}
