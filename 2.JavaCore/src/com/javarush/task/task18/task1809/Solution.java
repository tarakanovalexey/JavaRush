package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        R.close();
        FileInputStream fromfile = new FileInputStream(file1);
        FileOutputStream intofile = new FileOutputStream(file2);
        byte[] array = new byte[fromfile.available()];
        while(fromfile.available() > 0)
            fromfile.read(array);
        fromfile.close();
        for (int i = array.length-1; i >= 0; i--)
            intofile.write(array[i]);
        intofile.close();
    }
}
