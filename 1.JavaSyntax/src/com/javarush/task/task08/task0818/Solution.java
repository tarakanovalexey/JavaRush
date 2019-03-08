package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Иванов", 1500);
        map.put("Сидоров", 500);
        map.put("Смирнов", 300);
        map.put("Казанский", 50);
        map.put("Романов", 5500);
        map.put("Началов", 2500);
        map.put("Причалов", 350);
        map.put("Козловский", 400);
        map.put("Мамин", 800);
        map.put("Папин", 900);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        map.entrySet().removeIf(entries -> entries.getValue()<500);
    }

    public static void main(String[] args) {

    }
}