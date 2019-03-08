package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(R.readLine());
        SimpleDateFormat format1 = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
        System.out.println(format1.format(date).toUpperCase());
    }
}
