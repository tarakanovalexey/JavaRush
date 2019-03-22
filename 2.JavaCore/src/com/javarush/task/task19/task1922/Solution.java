package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = R.readLine();
        R.close();
        BufferedReader input = new BufferedReader(new FileReader(file));
        while (input.ready()) {
            file = input.readLine();
            int count = 0;
            for (int i = 0; i < words.size(); i++) {
                Pattern pattern = Pattern.compile("\\b"+words.get(i)+"\\b");
                Matcher matcher = pattern.matcher(file);
                while (matcher.find())
                    count++;
            }
            if (count == 2)
                System.out.println(file);
        }
        input.close();
    }
}
