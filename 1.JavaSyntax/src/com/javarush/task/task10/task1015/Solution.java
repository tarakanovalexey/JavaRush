package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] array = new ArrayList[3];
        for (int i = 0; i < 3; i++){
            array[i] = new ArrayList<>();
            array[i].add(String.valueOf((i+1)*(i+2)));
            array[i].add(String.valueOf((i+2)*(i+3)));
            array[i].add(String.valueOf((i+3)*(i+4)));
        }
        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}