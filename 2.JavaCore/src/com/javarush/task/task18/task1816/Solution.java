package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
       // args[0] - filename
        FileInputStream input = new FileInputStream(args[0]);
        byte[] arr = new byte[input.available()];
        int count = 0;
        while (input.available() > 0)
            input.read(arr);
        input.close();
        for (int i = 0; i < arr.length; i++)
            if (arr[i] >= (int) 'A' && arr[i] <= (int) 'Z' || arr[i] >= (int) 'a' && arr[i] <= (int) 'z')
                count++;
        System.out.println(count);
    }
}
