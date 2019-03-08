package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 1, i = 1, result = 0;
        while (a<=10) {
            while (i <= 10) {
                result = a * i;
                System.out.print(result+" ");
                i++;
            }
            i = 1;
            a++;
            System.out.println();
        }
    }
}
