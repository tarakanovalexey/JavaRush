package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        char[] chararr = s.toCharArray();
        ArrayList<Character> charlist = new ArrayList<>();
        for (int i = 0; i<s.length(); i++)
            charlist.add(chararr[i]);
        String text = "";
        for (int i = 0; i<40; i++){
            text = "";
            for(Character each:charlist)
                text +=each.toString();
            System.out.println(text);
            charlist.remove(0);
        }
    }
}

