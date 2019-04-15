package com.javarush.task.task20.task2025;

/*
Алгоритмы-числа
*/
public class Solution {
    public static long[] getNumbers(long N) {
        long counter = 0;
        for (long i = 1; i<N; i++) {
            long len = String.valueOf(i).length();
            char sum;
            long total = 0;
            for (int j = 0; j < len; j++) {
                sum = String.valueOf(i).charAt(j);
                total += Math.pow(Integer.parseInt(String.valueOf(sum)), len);
                if (j == len-1) {
                    if (total == i) {
                        counter++;
                        System.out.print(total+" ");
                    }
                    total = 0;
                }
            }
        }
        long[] result = null;
        return result;
    }

    public static void main(String[] args) {
        long[] x = getNumbers(2147483647);
    }
}
