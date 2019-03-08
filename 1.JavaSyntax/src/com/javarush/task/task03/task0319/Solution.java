package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String name = R.readLine();
        String sn1 = R.readLine();
        String sn2 = R.readLine();
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        System.out.print(name+" получает "+n1+" через "+n2+" лет.");
    }
}
