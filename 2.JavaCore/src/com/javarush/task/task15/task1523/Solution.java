package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {

    String name;
    int age;

    public Solution(){

    }

    Solution(String name){

    }

    private Solution(String name, int age){

    }

    protected Solution(int age, String name){

    }

    public static void main(String[] args) {

    }
}

