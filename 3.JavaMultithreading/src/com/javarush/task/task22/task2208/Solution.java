package com.javarush.task.task22.task2208;

import java.util.*;

/* 
Формируем WHERE
*/
public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "Ivanov");
        map.put("country", "Ukraine");
        map.put("city", "Kiev");
        map.put("age", "");
        map.put("age1", null);
        map.put("age2", null);
        map.put("qwe", "qweqweqwe");
        System.out.println(getQuery(map));

    }
    public static String getQuery(Map<String, String> params) {
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<String, String> each : params.entrySet())
            if (each.getValue() != null && !each.getValue().isEmpty())
                builder.append(each.getKey()+" = \'"+each.getValue()+"\'\n");
        return String.join(" and ", builder.toString().split("\n"));
    }
}
