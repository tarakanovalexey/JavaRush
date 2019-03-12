package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader buffer = new BufferedReader(new FileReader(R.readLine()));
        R.close();
        String line;
        while((line=buffer.readLine()) != null) {
            if(line.startsWith(args[0]+" "))
                System.out.println(line);
        }
        buffer.close();
    }
}
