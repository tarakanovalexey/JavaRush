package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int counter = Integer.parseInt(reader.readLine());
        int maximum=0;
        for (int i = 0; i < counter; i++)
        {
            BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader1.readLine());
            if (i == 0)
                maximum = a;
            maximum = maximum > a ? maximum : a ;
        }
        System.out.println(maximum);
    }
}

