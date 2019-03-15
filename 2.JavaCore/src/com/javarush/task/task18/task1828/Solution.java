package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = R.readLine();
        ArrayList<String> list = new ArrayList<>();
        BufferedReader input = new BufferedReader(new FileReader(file));
        while (input.ready()){
            list.add(input.readLine());
        }
        input.close();

        if(args[0].equals("-u")){

            String update = String.format("%-8s%-30s%-8s%-4s", args[1].trim(), args[2].trim(), args[3].trim(), args[4].trim());
            for (int i = 0 ; i < list.size(); i++)
                if (list.get(i).substring(0, 8).trim().equals(args[1]))
                    list.set(i, update);
        }

        if(args[0].equals("-d")){
            for (int i = 0 ; i < list.size(); i++)
                if (list.get(i).substring(0, 8).trim().equals(args[1]))
                    list.remove(i);
        }

        BufferedWriter output = new BufferedWriter(new FileWriter(file));
        for (int i = 0; i < list.size(); i++) {
            output.write(list.get(i));
            output.newLine();
        }
        output.close();
    }
}
