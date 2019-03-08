package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        return R.readLine();
    }

    public static int readInt() throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        return Integer.parseInt(R.readLine());
    }

    public static double readDouble() throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        return Double.parseDouble(R.readLine());
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        return Boolean.parseBoolean(R.readLine());
    }

    public static void main(String[] args) {

    }
}
