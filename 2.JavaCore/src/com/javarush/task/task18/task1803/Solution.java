package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

public class Solution {

    public static void main(String[] args) throws Exception {
            BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream input = new FileInputStream(R.readLine());
            R.close();
            HashMap<Byte, Integer> map = new HashMap<>();
            byte b;
            //System.out.println("Debug");
            while(input.available() > 0) {
                b = (byte) input.read();
              // System.out.println(b);
                if (map.containsKey(b)){
                    //System.out.println("Debug2");
                map.put(b, (map.get(b) + 1));}
                else
                    map.put(b,1);
                //System.out.println("Debug3");
            }
            input.close();
            /*
            for (Map.Entry<Integer, Integer> each : map.entrySet()) {
                int x = each.getKey();
                char y = (char) x;
                System.out.println(each.getKey() + " : " + each.getValue() + " : " + y);
            } */
            int z = Collections.max(map.values());
            for (Map.Entry<Byte, Integer> each : map.entrySet()) {
                if (each.getValue() == z)
                System.out.print(each.getKey()+" ");
            }

    }
}
