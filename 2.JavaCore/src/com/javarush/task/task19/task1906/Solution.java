package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        R.close();
        FileReader input = new FileReader(file1);
        FileWriter output = new FileWriter(file2);
        while (input.ready()){
            input.read();
            output.write(input.read());
        }
        input.close();
        output.close();
    }
}
