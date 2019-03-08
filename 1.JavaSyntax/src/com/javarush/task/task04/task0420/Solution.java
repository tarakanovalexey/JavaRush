package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String as = R.readLine();
        int a = Integer.parseInt(as);
        String bs = R.readLine();
        int b = Integer.parseInt(bs);
        String cs = R.readLine();
        int c = Integer.parseInt(cs);
        int arr[] = new int[]{a,b,c};
        for (int j = 0; j<=1; j++) {
            for (int i = 0; i <= 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int x = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = x;
                }
            }
        }
        System.out.print(arr[0]+" "+arr[1]+" "+arr[2]);
    }
}
