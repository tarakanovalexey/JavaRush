package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        String file3 = R.readLine();
        R.close();

        FileInputStream input = new FileInputStream(file1);
        FileOutputStream output1 = new FileOutputStream(file2);
        FileOutputStream output2 = new FileOutputStream(file3);
        byte[] buffer = new byte[input.available()];
        while (input.available() > 0) {
            input.read(buffer);
        }

        if (buffer.length % 2 == 0) {
            for (int i = 0; i < buffer.length; i++) {
                if (i < buffer.length/2) {
                    output1.write(buffer[i]);
                }
                else {
                    output2.write(buffer[i]);
                }
            }
        }
        else {
            for (int i = 0; i < buffer.length; i++) {
                if (i < (buffer.length/2)+1) {
                    output1.write(buffer[i]);
                    System.out.println("here3");
                }
                else {
                    output2.write(buffer[i]);
                }
            }
        }
            input.close();
            output1.close();
            output2.close();
    }
}
