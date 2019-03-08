package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        HashSet<String> uniq = new HashSet<>();
        uniq.addAll(list);
        for (String each : uniq) {
            for (int i = 0, c = 1; i < list.size(); i++) {
                if (each.equals(list.get(i))) {
                    result.put(each, c);
                    c++;
                }
            }
        }
        TreeMap<String, Integer> result1 = new TreeMap<>(result);
        return result1;
    }
}

