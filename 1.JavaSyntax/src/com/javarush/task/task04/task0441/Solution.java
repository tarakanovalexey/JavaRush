package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String text = R.readLine();
        int a = Integer.parseInt(text);
        text = R.readLine();
        int b = Integer.parseInt(text);
        text = R.readLine();
        int c = Integer.parseInt(text);
        int x = 0;
        int arr[] = new int[]{a,b,c};
        for (int j = 0; j<=1; j++)
            for (int i = 0; i<=1; i++)
                if (arr[i]<arr[i+1]) {
                    x = arr[i + 1];
                    arr[i+1] = arr[i];
                    arr[i] = x;
                }
        System.out.print(arr[1]);
    }
}
