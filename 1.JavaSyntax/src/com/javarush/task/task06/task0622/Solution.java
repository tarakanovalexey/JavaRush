package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int k = 0;
        int i = 5;
        while (i != 0) {
            numbers.add(Integer.parseInt(reader.readLine()));
            i--;
        }

        Collections.sort(numbers);
        for (i = 0; i < 5; i++)
            System.out.println(numbers.get(i));
    }
}
