package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = R.readLine();
        String text = R.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        while (true){
            writer.write(text);
            if (text.equals("exit")) break;
            writer.newLine();
            text = R.readLine();
        }
        writer.close();
        R.close();
    }
}
