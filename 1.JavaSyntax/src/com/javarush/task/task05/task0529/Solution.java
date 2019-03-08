package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int sum1 = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String s = buffer.readLine();
            if (s.equals("сумма")) {
                System.out.print(sum1);
                break;
            }
            int sum = Integer.parseInt(s);
            sum1 = sum1 + sum;
        }
    }
}
