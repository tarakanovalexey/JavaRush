package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> x = new ArrayList<>();
        while (true) {
            try {
                x.add(Integer.parseInt(R.readLine()));
            } catch (Exception e) {
                for (Integer each : x)
                    System.out.println(each);
                break;
            }
        }

    }
}
