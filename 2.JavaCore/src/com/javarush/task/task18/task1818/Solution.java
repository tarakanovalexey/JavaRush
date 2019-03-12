package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        String file3 = R.readLine();
        R.close();
        FileOutputStream sfile1 = new FileOutputStream(file1);
        FileInputStream sfile2 = new FileInputStream(file2);
        FileInputStream sfile3 = new FileInputStream(file3);
        byte[] arr1 = new byte[sfile2.available()];
        while (sfile2.available() > 0)
            sfile2.read(arr1);
        sfile2.close();
        byte[] arr2 = new byte[sfile3.available()];
        while (sfile3.available() > 0)
            sfile3.read(arr2);
        sfile3.close();
        sfile1.write(arr1);
        sfile1.write(arr2);
        sfile1.close();
    }
}
