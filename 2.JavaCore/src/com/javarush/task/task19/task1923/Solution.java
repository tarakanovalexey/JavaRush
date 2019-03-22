package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(args[0]));
        String[] arr;
        List<String> list = new ArrayList<>();
        while (input.ready()) {
            arr = input.readLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].matches(".*\\d+.*") && arr[i].matches(".*\\w*.*"))
                    list.add(arr[i]);
            }
        }
        input.close();
        BufferedWriter output = new BufferedWriter(new FileWriter(args[1]));
        for (String each : list)
            output.write(each+" ");
        output.close();
    }
}
