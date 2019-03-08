package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine().replace(" ","");
        char[] text1 = text.toCharArray();
        ArrayList<Character> vowels1 = new ArrayList<>();
        ArrayList<Character> notvowels = new ArrayList<>();
        for (int i = 0 ; i<text.length(); i++)
            if (isVowel(text1[i])) {
                vowels1.add(text1[i]);
                vowels1.add(' ');
            }
            else {
                notvowels.add(text1[i]);
                notvowels.add(' ');
            }
            for (int i = 0; i<vowels1.size(); i++)
                System.out.print(vowels1.get(i));
        System.out.println("");
        for (int i = 0; i<notvowels.size(); i++)
            System.out.print(notvowels.get(i));
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}