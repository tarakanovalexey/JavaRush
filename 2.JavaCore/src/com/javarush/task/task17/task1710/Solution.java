package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        String sex;
        String info;
        Person P;
        if (args[0].equals("-c"))
            if (args[2].equals("м")) {
                allPeople.add(P = Person.createMale(args[1], date.parse(args[3])));
                System.out.println(allPeople.indexOf(P));
            }
            else {
                allPeople.add(P = Person.createFemale(args[1], date.parse(args[3])));
                System.out.println(allPeople.indexOf(P));
            }
        if (args[0] == "-u")
            if (args[3].equals("м")) allPeople.set(Integer.parseInt(args[1]), Person.createMale(args[2], date.parse(args[4])));
            else allPeople.set(Integer.parseInt(args[1]), Person.createFemale(args[2], date.parse(args[4])));
        if (args[0] == "-d") {
            allPeople.get(Integer.parseInt(args[1])).setName(null);
            allPeople.get(Integer.parseInt(args[1])).setBirthDate(null);
            allPeople.get(Integer.parseInt(args[1])).setSex(null);
        }
        if (args[0] == "-i") {
            int i = Integer.parseInt(args[1]);
            if (allPeople.get(i).getSex() == Sex.MALE) {
                sex = "м";
                info = allPeople.get(i).getName()+" "+sex+" "+dateFormat.format(allPeople.get(i).getBirthDate());
            } else {
                sex = "ж";
                info = allPeople.get(i).getName()+" "+sex+" "+dateFormat.format(allPeople.get(i).getBirthDate());
            }
            System.out.println(info);
        }
    }
}
