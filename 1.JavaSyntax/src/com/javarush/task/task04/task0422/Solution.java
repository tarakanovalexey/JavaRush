package com.javarush.task.task04.task0422;

/* 
18+
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String name = R.readLine();
        String sage = R.readLine();
        int age = Integer.parseInt(sage);
        if (age < 18)
            System.out.println("Подрасти еще");
    }
}
