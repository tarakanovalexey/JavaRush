package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Стрелков","Иван");
        map.put("Петров","Петр");
        map.put("Сидоров","Андрей");
        map.put("Иванов","Алексей");
        map.put("Петрова","Марина");
        map.put("Иванова","Ксения");
        map.put("Акчурин","Павел");
        map.put("Смирнов","Дмитрий");
        map.put("Помидоров","Александр");
        map.put("Новиков","Евгений");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int count = 0;
        for (Map.Entry<String, String> ts : map.entrySet())
        if (ts.getValue().equals(name))
            count++;
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (Map.Entry<String, String> ts : map.entrySet())
            if (ts.getKey().equals(lastName))
                count++;
        return count;
    }

    public static void main(String[] args) {

    }
}
