package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Barsik", new Cat("Barsik"));
        map.put("Sneshok", new Cat("Sneshok"));
        map.put("Pushok", new Cat("Pushok"));
        map.put("Gav", new Cat("Gav"));
        map.put("Kotleta", new Cat("Kotleta"));
        map.put("Petka", new Cat("Petka"));
        map.put("Vaska", new Cat("Vaska"));
        map.put("Zaika", new Cat("Zaika"));
        map.put("Laika", new Cat("Laika"));
        map.put("Balalaika", new Cat("Balalaika"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> each : map.entrySet())
            set.add(each.getValue());
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
