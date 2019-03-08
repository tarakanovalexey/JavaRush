package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        int age = Integer.parseInt(sAge);
        String name = reader.readLine();
        System.out.print(name+" захватит мир через ");
        System.out.print(age+" лет. Му-ха-ха!");
    }
}
