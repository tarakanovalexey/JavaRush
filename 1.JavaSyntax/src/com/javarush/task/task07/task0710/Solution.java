package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> array = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            array.add(0, R.readLine());
        for (int i = 0; i < 10; i++)
            System.out.println(array.get(i));
    }
}
