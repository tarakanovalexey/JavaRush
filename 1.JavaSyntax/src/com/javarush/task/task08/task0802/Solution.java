package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> hash = new HashMap<>();
        hash.put("арбуз", "ягода");
        hash.put("банан", "трава");
        hash.put("вишня", "ягода");
        hash.put("груша", "фрукт");
        hash.put("дыня", "овощ");
        hash.put("ежевика", "куст");
        hash.put("жень-шень", "корень");
        hash.put("земляника", "ягода");
        hash.put("ирис", "цветок");
        hash.put("картофель", "клубень");
        for (Map.Entry<String, String> pair : hash.entrySet())
        {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
