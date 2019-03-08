package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = R.readLine();
        BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        ArrayList<Integer> array = new ArrayList<>();
        while (input.ready()){
            int i = Integer.parseInt(input.readLine());
            if (i % 2 == 0)
                array.add(i);
        }
        Collections.sort(array);
        for(Integer each:array)
            System.out.println(each);
        input.close();
        R.close();
    }
}
