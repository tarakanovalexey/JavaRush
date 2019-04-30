package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("Амиго и Диего лучшиедрузья!"));
    }

    public static String getPartOfString(String string) {
        StringBuilder builder = new StringBuilder();
        if (string == null)
            throw new TooShortStringException();
        if (string.split(" ").length > 4) {
        for (int i = 0; i < string.split(" ").length; i++) {
            if (i > 0 && i <=3)
                builder.append(string.split(" ")[i]+" ");
                        else if (i == 4) builder.append(string.split(" ")[i]);
            }
        } else throw new TooShortStringException();
        return builder.toString();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
