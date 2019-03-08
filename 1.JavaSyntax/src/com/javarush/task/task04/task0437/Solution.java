package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String k = "8";
        for (int i = 0; i < 10; i++) {
            System.out.println(k);
            k = k + "8";
        }
    }
}
