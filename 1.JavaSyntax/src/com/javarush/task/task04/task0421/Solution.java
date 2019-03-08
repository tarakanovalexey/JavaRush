package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String name1 = R.readLine();
        String name2 = R.readLine();
        if (name1.equals(name2))
            System.out.println("Имена идентичны");
        else
            if (name1.length()== name2.length())
                System.out.println("Длины имен равны");
    }
}
