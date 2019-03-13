package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream input = new FileInputStream(args[1]);
        FileOutputStream output = new FileOutputStream(args[2]);
        if (args[0].equals("-e"))
            while(input.available() > 0)
                output.write(input.read()+1);
            else while (input.available() > 0)
                output.write(input.read()-1);
            input.close();
            output.close();

    }

}
