package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = "";
        while (true)
        try {
            FileInputStream input = new FileInputStream(file = R.readLine());
            input.close();
        } catch (IOException e) {
            System.out.println(file);
            break;
        }
        try { R.close(); }
        catch (IOException e1) {}
    }
}
