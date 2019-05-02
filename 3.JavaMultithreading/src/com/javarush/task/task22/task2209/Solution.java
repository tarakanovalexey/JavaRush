package com.javarush.task.task22.task2209;

import javax.management.StringValueExp;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Составить цепочку слов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String file = reader.readLine();
        //reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader("your.file.name"));
        StringBuilder text = new StringBuilder();
        while (reader1.ready()){
            text.append(reader1.readLine());
            if (reader1.ready())
                text.append(" ");
        }
        StringBuilder result = getLine(text.toString().trim().split(" "));
        reader1.close();
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        StringBuilder builder = new StringBuilder();
        List<StringBuilder> arr = new ArrayList<>();
        for (String each : words) {
            arr.add(new StringBuilder().append(each));
        }
        ListIterator<StringBuilder> it = arr.listIterator();
        Set<StringBuilder> res = new HashSet<>();
        while (it.hasNext()){
            StringBuilder element = it.next();
            for (int i = 0; i < words.length; i++) {
                if (String.valueOf(element.toString().charAt(element.toString().length() - 1)).equalsIgnoreCase(String.valueOf(words[i].charAt(0))) &&
                        !Arrays.asList(element.toString().split(" ")).contains(words[i])) {
                    element.append(" ").append(words[i]);
                    i = 0;
                } else {
                    System.out.println(element);
                    it.add(element);
                }
            }
            it.next();

        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder each : arr) {
            res.add(each);
        }

        for (StringBuilder each : res) {
            if (result.toString().split(" ").length < each.toString().split(" ").length)
                result = each;
        }
        return result;
    }
}
