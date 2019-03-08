package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> list = new HashMap<>();
        String x = R.readLine();
        list.put("January"," is the 1 month");
        list.put("February"," is the 2 month");
        list.put("March"," is the 3 month");
        list.put("April"," is the 4 month");
        list.put("May"," is the 5 month");
        list.put("June"," is the 6 month");
        list.put("July"," is the 7 month");
        list.put("August"," is the 8 month");
        list.put("September"," is the 9 month");
        list.put("October"," is the 10 month");
        list.put("November"," is the 11 month");
        list.put("December"," is the 12 month");
        for(Map.Entry<String, String> each : list.entrySet())
            if(x.equals(each.getKey())) System.out.print(each.getKey()+each.getValue());

    }
}
