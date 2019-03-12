package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) throws IOException {
    // args[0] - filename
        FileInputStream file = new FileInputStream(args[0]);
    //    FileInputStream file = new FileInputStream("D:\\text1.txt");
        int countspaces = 0;
        double x = 0.0d;
        byte[] arr = new byte[file.available()];
        while (file.available() > 0)
            file.read(arr);
        file.close();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ')
                countspaces++;
        }
        x = (double) countspaces / arr.length;
        x *= 100;
        System.out.printf(Locale.ENGLISH, "%.2f", x);
    }
}
