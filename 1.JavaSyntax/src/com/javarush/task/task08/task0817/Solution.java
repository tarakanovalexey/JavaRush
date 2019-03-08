package com.javarush.task.task08.task0817;

import java.util.*;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Стрелков","Алексей");
        map.put("Петров","Петр");
        map.put("Сидоров","Андрей");
        map.put("Иванов","Алексей");
        map.put("Петрович","Евгений");
        map.put("Залпов","Андрей");
        map.put("Акчурин","Павел");
        map.put("Смирнов","Дмитрий");
        map.put("Помидоров","Александр");
        map.put("Новиков","Евгений");
        return map;

    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        ArrayList<String> array = new ArrayList<>();
        HashMap<String, String> copy = new HashMap<>(map);
        for(Map.Entry<String, String> ts : copy.entrySet())
            array.add(ts.getValue());
        String x = "";
        int counter = 0;
        for (int i = 0; i < array.size(); i++) {
            x = array.get(i);
            counter = 0;
            for (int j = 0; j < array.size(); j++)
                if (array.get(j) == x) counter++;
                if (counter > 1) removeItemFromMapByValue(map, x);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
