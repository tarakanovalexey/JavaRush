package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        int k = 0;
        for (int i = 0 ; i<array.length-1; i++)
            for (int j = 0 ; j<array.length-1; j++)
                if (array[j]>array[j+1]){
                    k = array[j+1];
                    array[j+1]=array[j];
                    array[j]=k;
                }
    }
}
