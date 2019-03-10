package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(R.readLine());
        R.close();
        TreeSet<Byte> map = new TreeSet<>();
        byte b;
        while(input.available() > 0) {
            b = (byte) input.read();
                map.add(b);
        }
        input.close();
        for (Byte each : map)
        System.out.print(each + " ");
        }

    }

