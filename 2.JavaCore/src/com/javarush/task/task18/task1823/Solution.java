package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = "";
        while (true) {
            file = R.readLine();
            if (file.equals("exit")) {
                break;
            }
            Thread t = new ReadThread(file);
            t.start();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут

        public void run() {
            try {
                FileInputStream input = new FileInputStream(fileName);
                HashMap<Byte, Integer> map = new HashMap<>();
                byte b;
                while(input.available() > 0) {
                    b = (byte) input.read();
                    if (map.containsKey(b)){
                        map.put(b, (map.get(b) + 1));}
                    else
                        map.put(b,1);
                }
                input.close();
                int z = Collections.max(map.values());
                for (Map.Entry<Byte, Integer> each : map.entrySet()) {
                    if (each.getValue() == z)
                    synchronized (resultMap){resultMap.put(fileName, (int) each.getKey());}
                }
            }
            catch (IOException e) {}

        }
    }

}
