package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        String sa = R.readLine();
        int a = Integer.parseInt(sa);
        while (a != 0)
        {
            System.out.println(text);
            a--;
        }
    }
}
