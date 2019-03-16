package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        R.close();
        String text = "";
        BufferedReader input = new BufferedReader(new FileReader(file1));
        while(input.ready())
            text += input.readLine();
        input.close();
        String pattern = "\\b\\d+\\b";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        BufferedWriter output = new BufferedWriter(new FileWriter(file2));
        while (m.find())
            output.write(m.group()+" ");
        output.close();
    }
}
