package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1981"));
        map.put("Bichkov", df.parse("JULY 5 1980"));
        map.put("Hamster", df.parse("AUGUST 19 1980"));
        map.put("Campbell", df.parse("JANUARY 22 1981"));
        map.put("Bell", df.parse("SEPTEMBER 11 1980"));
        map.put("Starnov", df.parse("NOVEMBER 17 1980"));
        map.put("Diego", df.parse("DECEMBER 28 1980"));
        map.put("May", df.parse("MARCH 8 1979"));
        map.put("Stark", df.parse("MAY 19 1982"));
        map.put("Force", df.parse("JUNE 14 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> map1 = new HashMap<>(map);
        for (HashMap.Entry<String, Date> ts : map1.entrySet())
            if (ts.getValue().getMonth() == 5 || ts.getValue().getMonth() == 6 || ts.getValue().getMonth() == 7 )
                map.remove(ts.getKey());
    }

    public static void main(String[] args) {

    }
}
