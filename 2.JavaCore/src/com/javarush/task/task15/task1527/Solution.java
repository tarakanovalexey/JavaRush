package com.javarush.task.task15.task1527;

import javax.print.DocFlavor;
import javax.swing.text.html.parser.Parser;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        char[] array = text.toCharArray();
        String arg = "";
        String carg = "";
        double darg = 0d;
        boolean checker = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == '?' || array[i] == '&'){
                i++;
                while (array[i] != '=') {
                    if (array[i] == '&') {i--; break;}
                    arg += array[i];
                    if (i > array.length-2) break;
                    i++;
                }
                if (array[i-1] == 'j' && array[i-2] == 'b' && array[i-3] == 'o' && (array[i-4] == '&' || array[i-4] == '?')) {
                    i++;
                    checker = false;
                    while (array[i] != '&') {
                        carg += array[i];
                        if (i > array.length - 2) break;
                        i++;
                    }
                    i--;
                }
                arg += " ";
            }
        }
        arg = arg.substring(0, arg.length()-1);
        System.out.println(arg);
        if (!checker)
        try{
            darg = Double.parseDouble(carg);} catch (NumberFormatException e)
        {
            alert(carg);
        }
        if (darg != 0d) alert(darg);
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
