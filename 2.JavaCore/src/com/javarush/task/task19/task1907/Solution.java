package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = R.readLine();
        R.close();
        FileReader input = new FileReader(file);
        String text = "";
        while (input.ready()){
            text += (char) input.read();
        }
        input.close();
        String pattern = "\\bworld\\b";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        int count = 0;
        while (m.find())
            count++;
        System.out.println(count);
    }
}
