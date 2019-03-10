package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(R.readLine());
        R.close();
        int text = 0, count = 0;
        while (input.available() > 0) {
            text = input.read();
            if (text == 44)
                count++; }
        input.close();
        System.out.println(count);
    }
}
