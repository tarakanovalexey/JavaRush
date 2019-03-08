package com.javarush.task.task15.task1516;

/* 
Значения по умолчанию
*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Object solution = new Solution();
        System.out.println(((Solution) solution).intVar);
        System.out.println(((Solution) solution).doubleVar);
        System.out.println(((Solution) solution).DoubleVar);
        System.out.println(((Solution) solution).booleanVar);
        System.out.println(((Solution) solution).ObjectVar);
        System.out.println(((Solution) solution).ExceptionVar);
        System.out.println(((Solution) solution).StringVar);

    }
}
