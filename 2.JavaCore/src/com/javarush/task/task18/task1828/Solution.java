package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = R.readLine();
        R.close();

        if (args.length < 1){ }
        else if (args[1].equals("-d")) {

            BufferedReader input = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            String line ="";
            int max = 0;
            while(input.ready()) {
                line = input.readLine().substring(0, 8);
                line = line.replace(" ", "");
                if (Integer.parseInt(line) >= max) {
                    max = Integer.parseInt(line) + 1;
                }
            }
            input.close();
            com.javarush.task.task18.task1827.Solution.Formater f = new com.javarush.task.task18.task1827.Solution.Formater();
            String id = f.method(max+"", 8);
            String productName = f.method(args[1], 30);
            String price = f.method(args[2], 8);
            String quantity = f.method(args[3], 4);
            String wout = id+productName+price+quantity;

            BufferedWriter output = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "windows-1251"));
            output.newLine();
            output.write(wout);
            output.close();
        } else {

        }
    }

    public static class Formater{
        int y;
        char[] arr = new char[y];
        public String method(String x, int y){
            this.y = y;
            String res = "";
            char[] arr = new char[y];
            for (int i = 0 ; i < arr.length; i++)
                try {
                    arr[i] = x.toCharArray()[i];
                }
                catch (IndexOutOfBoundsException e) {
                    arr[i] = ' ';
                }
            for (int i = 0; i < arr.length; i++)
                res += arr[i];
            return res;
        }
    }


}
