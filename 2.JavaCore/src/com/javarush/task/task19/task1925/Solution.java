package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(args[0]));
        BufferedWriter output = new BufferedWriter(new FileWriter(args[1]));
        String[] arr;
        List<String> outtext = new ArrayList<>();
        while (input.ready()) {
            arr = input.readLine().split(" ");
            for (int i = 0; i < arr.length; i++)
                if (arr[i].length()> 6)
                        outtext.add(arr[i]);
        }
            for (int i = 0; i < outtext.size(); i++)
                if (i < outtext.size()-1)
                 output.write(outtext.get(i)+",");
                else output.write(outtext.get(i));
        input.close();
        output.close();
    }
}
