package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Иван");
        map.put("Смирнов", "Александр");
        map.put("Петров", "Алексей");
        map.put("Сидоров", "Дмитрий");
        map.put("Сапсанов", "Петр");
        map.put("Иванов", "Евгений");
        map.put("Смирнов", "Евгений");
        map.put("Петров", "Дмитрий");
        map.put("Сидоров", "Александр");
        map.put("Брин", "Иван");
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
