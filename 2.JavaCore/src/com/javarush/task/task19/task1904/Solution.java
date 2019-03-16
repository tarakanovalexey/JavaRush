package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;
        PersonScannerAdapter (Scanner fileScanner){
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException {
            String[] data = fileScanner.nextLine().split(" ");
            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            Date birthDate = null;
            try {
                birthDate = format.parse(data[3] + " " + data[4] + " " + data[5]);
            } catch(ParseException e) {e.printStackTrace();}
            return new Person(firstName, middleName, lastName, birthDate);
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }
}
