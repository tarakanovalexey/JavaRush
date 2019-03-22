package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = R.readLine();
        R.close();
        BufferedReader input = new BufferedReader(new FileReader(file));
        List<String> list = new ArrayList<>();
        while(input.ready()) {
            char[] x = input.readLine().toCharArray();
            for (int i = x.length-1; i >= 0 ; i--)
                System.out.print(x[i]);
            if (input.ready())
            System.out.print(System.lineSeparator());
        }
        input.close();
    }
}
