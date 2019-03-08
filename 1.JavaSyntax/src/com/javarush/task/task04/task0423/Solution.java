package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String name = R.readLine();
        String sage = R.readLine();
        int age = Integer.parseInt(sage);
        if (age>20)
            System.out.print("И 18-ти достаточно");
    }
}
