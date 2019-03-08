package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.javarush.task.task17.task1711.Person.createMale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        allPeople.add(new Person.createMale(1, "2"));
        int id;
        String name;
        String sex;
        SimpleDateFormat bd = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        Person p;
        if (args[0].equals("-c"))
        {
            for (int i = 1; i <args.length; i+=3)
            {
                name = args[i];
                sex = args[i+1];
                date = bd.parse(args[i+2]);
                if (sex.equals("MALE")) {
                    allPeople.add(p = new Person.createMale(name, date));
                }
            }
        }
        if (args[0].equals("-u"));
        if (args[0].equals("-d"));
        if (args[0].equals("-i"));
    }
}
