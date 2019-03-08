package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        int id = 0;
        String name = "";
        while (true) {
            String x = reader.readLine();
            if (x.equals("")) break;
            id = Integer.parseInt(x);
            name = reader.readLine();
            map.put(name, id);
            if (name.equals("")) break;
        }
        for(Map.Entry<String, Integer> each : map.entrySet())
            System.out.println(each.getValue()+" "+each.getKey());
    }
}
