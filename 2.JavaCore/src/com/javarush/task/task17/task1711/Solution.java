package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static com.javarush.task.task17.task1711.Person.createFemale;
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
        int id;
        String name;
        String sex;
        SimpleDateFormat bd = new SimpleDateFormat("dd/MM/yyyy");
        Date date;
        Person p;

        switch (args[0]) {

            case "-c":{

                for (int i = 1; i <args.length; i+=3)
                {
                    name = args[i];
                    sex = args[i+1];
                    date = bd.parse(args[i+2]);
                    synchronized (allPeople) {
                        if (sex.equals("м")) {
                            allPeople.add(p = createMale(name, date));
                            System.out.println(allPeople.indexOf(p));
                        }
                        else {
                            allPeople.add(p = createFemale(name, date));
                            System.out.println(allPeople.indexOf(p));
                        }
                    }
                }
                break;

            }

            case "-u":{
                for (int i = 1; i <args.length; i+=4)
                {
                    id = Integer.parseInt(args[i]);
                    name = args[i+1];
                    sex = args[i+2];
                    date = bd.parse(args[i+3]);
                    synchronized (allPeople) {
                        if (sex.equals("м")) {
                            allPeople.set(id, p = createMale(name, date));
                        }
                        else {
                            allPeople.set(id, p = createFemale(name, date));
                        }
                    }
                }
                break;
            }

            case "-d":{
                for (int i = 1; i <args.length; i++)
                {
                    id = Integer.parseInt(args[i]);
                    synchronized (allPeople) {
                        allPeople.get(id).setName(null);
                        allPeople.get(id).setSex(null);
                        allPeople.get(id).setBirthDate(null);
                    }
                }
                break;
            }

            case "-i":{
                SimpleDateFormat bd1 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                for (int i = 1; i <args.length; i++)
                {
                    id = Integer.parseInt(args[i]);
                    synchronized (allPeople) {
                    name = allPeople.get(id).getName();
                    if (allPeople.get(id).getSex().equals(Sex.MALE))
                        sex = "м";
                    else sex = "ж";
                        System.out.println(name+" "+sex+" "+bd1.format(allPeople.get(id).getBirthDate()));
                    }
                }
                break;
            }

        }
    }
}
