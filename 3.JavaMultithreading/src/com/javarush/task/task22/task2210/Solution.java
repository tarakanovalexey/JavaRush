package com.javarush.task.task22.task2210;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.asList(getTokens("level22.lesson13.task01", ".")).toString());

    }
    public static String [] getTokens(String query, String delimiter) {
        StringTokenizer st = new StringTokenizer(query, delimiter);
        String[] arr = new String[st.countTokens()];
        for (int i = 0; i < arr.length; i++)
            arr[i] = st.nextToken();
        return arr;
    }
}
