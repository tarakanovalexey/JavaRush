package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            list.add(R.readLine());
        int max = list.get(0).length();
        int min = list.get(0).length();
        for (int i = 0; i < 10; i++){
            max = max > list.get(i).length() ? max : list.get(i).length();
            min = min < list.get(i).length() ? min : list.get(i).length();
        }
        int cmax = 0, cmin = 0;
        int k = 0;
        while (k < 10) {
            if (max == list.get(k).length()) {
                cmax = k;
                break;
            }
            k++;
        }
        k = 0;
        while (k < 10) {
            if (min == list.get(k).length()) {
                cmin = k;
                break;
            }
            k++;
        }
        if (cmax < cmin)
            System.out.println(list.get(cmax));
        else System.out.println(list.get(cmin));

    }
}
