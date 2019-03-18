package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        String result = outputStream.toString();
        System.setOut(consoleStream);
        Pattern pattern = Pattern.compile("\\s\\W\\s");
        Matcher m = pattern.matcher(result);
        String symb = "";
        if (m.find())
            symb = m.group().trim();
        int result1 = 0;
        switch (symb){
            case "+": {
                result1 = Integer.parseInt(result.split("\\+")[0].trim())+Integer.parseInt(result.split("\\+")[1].replaceAll("=","").trim());
                break;
            }
            case "-": {
                result1 = Integer.parseInt(result.split("-")[0].trim())-Integer.parseInt(result.split("-")[1].replaceAll("=","").trim());
                break;
            }
            case "*": {
                result1 = Integer.parseInt(result.split("\\*")[0].trim())*Integer.parseInt(result.split("\\*")[1].replaceAll("=","").trim());
                break;
            }
        }
        result = result.replaceAll("\\r\\n", "") + result1;
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

