package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.List;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int []> array = new ArrayList<>();
        array.add(new int[5]);
        array.add(new int[2]);
        array.add(new int[4]);
        array.add(new int[7]);
        array.add(new int[0]);
        for(int[] each : array){
            for(int i = 1; i < each.length+1; i++)
                each[i-1] = i*each.length;}
        return array;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
