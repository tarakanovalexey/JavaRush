package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        R.close();
        BufferedReader input = new BufferedReader(new FileReader(file1));
        String text = "";
        while (input.ready())
            text += input.readLine();
        input.close();
        text = text.replaceAll("\\p{Punct}","");
        BufferedWriter output = new BufferedWriter(new FileWriter(file2));
        output.write(text);
        output.close();
    }
}
