package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        int a = Integer.parseInt(text);
        text = R.readLine();
        int b = Integer.parseInt(text);
        text = R.readLine();
        int c = Integer.parseInt(text);
        if (a == b && b == c)
            System.out.println(a+" "+b+" "+c);
        else {
        if (a == b)
            System.out.println(a+" "+b);
        if (a == c)
            System.out.println(a+" "+c);
        if (c == b)
            System.out.println(c+" "+b); }
    }
}