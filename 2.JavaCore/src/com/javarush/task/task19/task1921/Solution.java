package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader input = new BufferedReader(new FileReader(args[0]));
        List<String> list = new ArrayList<>();
        while (input.ready())
            list.add(input.readLine());
        input.close();
        String[] arr;
        String name;
        String date;

        for (String each : list) {
            name = "";
            date = "";
            arr = each.split(" ");
            for (int i = arr.length - 3 ; i < arr.length; i++) {
                date += arr[i]+" ";
            }
            for (int i = 0 ; i < arr.length - 3; i++) {
                    name += arr[i]+" ";
            }
            Date date1 = new SimpleDateFormat("dd MM yyyy").parse(date.trim());
            PEOPLE.add(new Person(name.trim(), date1));
        }

    }
}
