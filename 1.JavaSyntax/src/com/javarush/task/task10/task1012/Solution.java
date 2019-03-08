package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        ArrayList<Integer> count = new ArrayList<>();
        for(int i = 0; i< 33; i++)
            count.add(i,0);
        for(int i = 0; i < alphabet.size(); i++)
            for(String each:list)
                for(Character cg:each.toCharArray())
                    if(alphabet.get(i).equals(cg))
                        count.set(i,count.get(i)+1);
        for(int i = 0; i< 33; i++)
            System.out.println(alphabet.get(i)+" "+count.get(i));
    }

}
