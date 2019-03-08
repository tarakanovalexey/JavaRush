package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
            BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> strings = new ArrayList<>();
            strings.add(R.readLine());
            int count = strings.get(0).length();
            for (int i = 1; i < 5; i++) {
                strings.add(R.readLine());
                count = count < strings.get(i).length() ? count : strings.get(i).length();
            }
            for (int i = 0; i < 5; i++)
                if (count == strings.get(i).length())
                    System.out.println(strings.get(i));

    }
}
