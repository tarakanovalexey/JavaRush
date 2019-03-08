package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int number1 = 0;
        while (true) {
            BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
            String snumber = R.readLine();
            int number = Integer.parseInt(snumber);
            if (number == -1) {
                number1 = number1 + number;
                break;}
            else number1 = number1 + number;
        }
        System.out.print(number1);
    }
}
