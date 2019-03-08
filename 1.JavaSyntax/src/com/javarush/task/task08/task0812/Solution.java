package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++)
            list.add(Integer.parseInt(R.readLine()));
        Integer x = 1, y = 1;
        for (int i = 0; i < 9; i++)
            if (list.get(i).equals(list.get(i+1))) {
                x++;
                if (y < x) y = x;
            } else x = 1;
            System.out.print(y);
    }
}