package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[0]);
    //    FileInputStream input = new FileInputStream("D:\\text1.txt");
        TreeMap<Byte, Integer> map = new TreeMap<>();
        byte[] arr = new byte[input.available()];
        while(input.available() > 0)
            input.read(arr);
        input.close();
        for (byte each : arr) {
            map.put(each, 1);
      //  System.out.println((char)each+" : ascii # = "+each);
            }

        int counter;

        for (Map.Entry<Byte, Integer> each : map.entrySet()) {
            counter = 0;
            for (int i = 0; i < arr.length; i++)
                if (each.getKey().equals(arr[i])) {
                    counter++;
                    each.setValue(counter);
                }
        }

 //       for (Map.Entry<Byte, Integer> each : map.entrySet())
 //           System.out.println("Byte: "+(char) (byte) each.getKey()+" / Value: "+each.getValue());

        for (Map.Entry<Byte, Integer> each : map.entrySet())
            System.out.println((char)(byte)each.getKey()+" "+each.getValue());

    }
}
