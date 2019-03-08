package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        InputStream inStream = new FileInputStream(R.readLine());
        int c;
        while (( c = inStream.read()) != -1){
        System.out.print((char) c);}
        R.close();
        inStream.close();
    }
}