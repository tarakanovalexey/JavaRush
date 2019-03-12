package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        FileInputStream infile1 = new FileInputStream(file1);
        byte[] arr1 = new byte[infile1.available()];
        while (infile1.available() > 0)
            infile1.read(arr1);
        infile1.close();
        FileInputStream infile2 = new FileInputStream(file2);
        byte[] arr2 = new byte[infile2.available()];
        while (infile2.available() > 0)
            infile2.read(arr2);
        infile2.close();
        byte[] arr3 = new byte[arr2.length+arr1.length];
        for (int i = 0; i < arr2.length; i++)
            arr3[i] = arr2[i];
        for (int i = arr2.length; i< arr2.length+arr1.length; i++)
            arr3[i] = arr1[i-arr2.length];
        FileOutputStream outfile1 = new FileOutputStream(file1);
        outfile1.write(arr3);
        outfile1.close();
    }
}
