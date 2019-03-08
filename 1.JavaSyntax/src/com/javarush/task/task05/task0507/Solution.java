package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        double srednee = 0;
        double count = 0, number1 = 0;
        while (true) {
            BufferedReader R =  new BufferedReader(new InputStreamReader(System.in));
            String snumber = R.readLine();
            int number = Integer.parseInt(snumber);
            if (number == -1)
                break;
            number1 = number1 + number;
            count++;
        }
        if (count>0)
            srednee = number1 / count;
        System.out.print(srednee);
    }
}


