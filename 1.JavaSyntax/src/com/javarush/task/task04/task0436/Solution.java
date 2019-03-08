package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        int m = Integer.parseInt(text);
        text = R.readLine();
        int n = Integer.parseInt(text);
        String f = "";
        for (int i = 1; i<=n; i++)
            f = f+"8";
        for (int j = 1; j<=m; j++)
            System.out.println(f);
    }
}
