package com.javarush.task.task20.task2002;

import java.io.*;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/* 
Читаем и пишем в файл: JavaRush
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("file.bin", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            User person = new User();
            person.setFirstName("Alex");
            person.setLastName("Tarakanov");
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.ENGLISH);
            person.setBirthDate(df.parse("14.06.1992 12:35:33"));
            person.setMale(true);
            person.setCountry(User.Country.RUSSIA);
            javaRush.users.add(person);
            User person2 = new User();
            person2.setFirstName("Anita");
            person2.setLastName("Tarakanova");
            person2.setBirthDate(df.parse("04.02.1992 05:23:54"));
            person2.setMale(false);
            person2.setCountry(User.Country.RUSSIA);
            javaRush.users.add(person2);
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the codeGym object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны
            System.out.println(javaRush.equals(loadedObject));
            for (User each : javaRush.users) {
                System.out.println("J: "+each.getFirstName());
                System.out.println("J: "+each.getLastName());
                System.out.println("J: "+each.getBirthDate());
                System.out.println("J: "+each.isMale());
                System.out.println("J: "+each.getCountry());
            }
            for (User each : loadedObject.users) {
                System.out.println("O: "+each.getFirstName());
                System.out.println("O: "+each.getLastName());
                System.out.println("O: "+each.getBirthDate());
                System.out.println("O: "+each.isMale());
                System.out.println("O: "+each.getCountry());
            }

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedWriter write = new BufferedWriter(new OutputStreamWriter(outputStream));
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.ENGLISH);
            String flag = users.isEmpty()? "no" : "yes";
            write.write(flag);
            write.write(System.lineSeparator());
            if (flag.equals("yes"))
                for (User each : users) {
                    write.write(each.getFirstName());
                    write.write(System.lineSeparator());

                    write.write(each.getLastName());
                    write.write(System.lineSeparator());

                    write.write(df.format(each.getBirthDate()));
                    write.write(System.lineSeparator());

                    write.write(each.isMale()?"true":"false");
                    write.write(System.lineSeparator());

                    write.write(each.getCountry().toString());
                    write.write(System.lineSeparator());
                }
            write.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            BufferedReader R = new BufferedReader(new InputStreamReader(inputStream));
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss", Locale.ENGLISH);
            String flag = R.readLine();
            if (flag.equals("yes"))
            while (R.ready()) {
                User person = new User();
                person.setFirstName(R.readLine());
                person.setLastName(R.readLine());
                person.setBirthDate(df.parse(R.readLine()));
                person.setMale(Boolean.parseBoolean(R.readLine()));
                person.setCountry(User.Country.valueOf(R.readLine()));
                users.add(person);
            }
            R.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
