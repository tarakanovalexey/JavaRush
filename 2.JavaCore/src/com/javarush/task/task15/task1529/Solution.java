package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        String x = "";
        int y = 0;
        try {
            BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
            x = R.readLine();
            R.close();
        } catch (IOException e) {
        }

        if (x.equals("helicopter")) result = new Helicopter();
        if (x.equals("plane")) {
            try {
                BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
                y = Integer.parseInt(R.readLine());
                R.close();
            } catch (IOException e) {
            }
            result = new Plane(y);
        }
    }
}
