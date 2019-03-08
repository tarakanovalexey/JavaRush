package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> array = new ArrayList<String>();
        array.add("First");
        array.add("Second");
        array.add("Third");
        array.add("Forth");
        array.add("Fifth");
        int a = array.size();
        System.out.println(a);
        for (int i = 0; i<5; i++)
            System.out.println(array.get(i));
    }
}
