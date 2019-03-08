package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] array = s.toCharArray();
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (x == 0) {
                array[i] = Character.toUpperCase(array[i]);
                x++;
            }
            if (array[i] == ' ') x = 0;
        }
        System.out.print(array);
    }
}
