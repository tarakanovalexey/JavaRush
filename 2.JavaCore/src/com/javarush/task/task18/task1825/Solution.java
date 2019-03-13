package com.javarush.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Собираем файл
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = R.readLine();
        ArrayList<String> arr = new ArrayList<>();
        for (String each : file.split("\\."))
            arr.add(each);
        String fileoutputname = "";
        for (int i = 0; i < arr.size()-1; i++) {
            fileoutputname += arr.get(i);
            if (i < arr.size() - 2)
                fileoutputname+=".";
        }
        String extension = "";
        TreeMap<String, String> map = new TreeMap<>();

        while (!(file).equals("end")) {
            extension = "";
            arr.clear();
            for (String each : file.split("\\."))
                arr.add(each);
            extension += arr.get(arr.size()-1);
            map.put(extension, file);
          file = R.readLine();
        }

        R.close();

        for (Map.Entry<String, String> each : map.entrySet()) {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(each.getValue()));
            FileOutputStream output = new FileOutputStream(fileoutputname, true);
            while (bis.available() > 0) {
                output.write(bis.read());
            }
            bis.close();
            output.close();
        }
    }
}
