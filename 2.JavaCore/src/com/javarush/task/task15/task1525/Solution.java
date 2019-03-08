package com.javarush.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();
    static {
        try {BufferedReader R = new BufferedReader(new FileReader(Statics.FILE_NAME));
        String text = R.readLine();
        while (text != null) {
            lines.add(text);
            text = R.readLine();
        }} catch (IOException e) {}
    }

    public static void main(String[] args) throws IOException {

        System.out.println(lines);
    }
}
