package com.javarush.task.task06.task0605;


import java.io.*;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double index = weight / (height*height);
            if (index < 18.5)
                System.out.print("Недовес: меньше чем 18.5");
            if (index>=18.5 && index<=24.9)
                System.out.print("Нормальный: между 18.5 и 24.9");
            if (index>=25 && index<=29.9)
                System.out.print("Избыточный вес: между 25 и 29.9");
            if (index>=30)
                System.out.print("Ожирение: 30 или больше");
        }
    }
}
