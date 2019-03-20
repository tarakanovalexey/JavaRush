package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader input = new FileReader(args[0]);
        HashMap<String, Double> map = new HashMap<>();
        String text = "";
        while (input.ready())
            text += (char) input.read();
        input.close();
        String[] arr = text.split("\n");
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i].split(" ")[0]))
                map.put(arr[i].split(" ")[0], Double.parseDouble(arr[i].split(" ")[1]));
            else {
                for (Map.Entry<String, Double> each : map.entrySet())
                    if (each.getKey().equals(arr[i].split(" ")[0]))
                        each.setValue(each.getValue() + Double.parseDouble(arr[i].split(" ")[1]));
            }
        }
        double maxvalue = 0;
        for (Map.Entry<String, Double> each : map.entrySet())
            if (each.getValue() > maxvalue)
                maxvalue = each.getValue();
        TreeMap<String, Double> map1 = new TreeMap<>(map);
        for (Map.Entry<String, Double> each : map.entrySet())
            if (each.getValue() != (maxvalue))
                map1.remove(each.getKey());
        for (Map.Entry<String, Double> each : map1.entrySet())
            System.out.println(each.getKey());
    }
}