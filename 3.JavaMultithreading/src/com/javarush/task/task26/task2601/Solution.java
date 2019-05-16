package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
    }

    public static Integer[] sort(Integer[] array) {
        double mediana;
        Arrays.sort(array);
        if (array.length % 2 == 0) {
            mediana = ((double)array[array.length/2-1] + (double)array[array.length/2])/2.0d;
        }
        else
            mediana = array[array.length/2];
        Comparator<Integer> c = (o1, o2) -> {
                double value = (int)(Math.abs(o1-mediana) - Math.abs(o2-mediana));
                if (value == 0) {
                    value = o1 - o2;
                }
                return (int) value;
        };
        Arrays.sort(array, c);
        return array;
    }
}
