package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            array.add(R.readLine());
        for (int i = 0; i <13; i++) {
            array.add(0, array.get(4));
            array.remove(5);
        }
        for (int i = 0; i < 5; i++)
            System.out.println(array.get(i));
    }
}
