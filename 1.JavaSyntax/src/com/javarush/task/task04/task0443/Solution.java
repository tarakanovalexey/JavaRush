package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String name = R.readLine();
        String ys = R.readLine();
        int y = Integer.parseInt(ys);
        String ms = R.readLine();
        int m = Integer.parseInt(ms);
        String ds = R.readLine();
        int d = Integer.parseInt(ds);
        System.out.println("Меня зовут "+name+".");
        System.out.print("Я родился "+d+"."+m+"."+y);
    }
}
