package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String name = R.readLine();
        for (int i = 0; i<10; i++)
            System.out.println(name+" любит меня.");
    }
}
