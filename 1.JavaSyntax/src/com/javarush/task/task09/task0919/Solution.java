package com.javarush.task.task09.task0919;

/* 
Деление на ноль
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        try {
        divideByZero();}
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void divideByZero(){
        int x = 20 / 0;
        System.out.println(x);
    }
}
