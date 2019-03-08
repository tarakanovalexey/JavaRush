package com.javarush.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int x = array.get(0);
        for (int i = 0; i<array.size()-1; i++)
            x = x > array.get(i+1) ? array.get(i+1) : x;
        return x;
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int x = Integer.parseInt(R.readLine());
        for (int i = 0 ; i < x; i++)
            list.add(Integer.parseInt(R.readLine()));
        return list;
    }
}
