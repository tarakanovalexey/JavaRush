package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();


    public static void main(String[] args) throws IOException {

        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        String input;
        R.close();
        BufferedReader read = new BufferedReader(new FileReader(file1));

        while ((input = read.readLine()) != null)
            allLines.add(input);

        read = new BufferedReader(new FileReader(file2));

        while ((input = read.readLine()) != null)
            forRemoveLines.add(input);
        read.close();

        new Solution().joinData();

    }

    public void joinData() throws CorruptedDataException {

        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
            else {
                allLines.clear();
                throw new CorruptedDataException();
        }





        /*List<String> allLines2 = new ArrayList<>(allLines);
        List<String> forRemoveLines2 = new ArrayList<>(forRemoveLines);
        boolean check = false;

        Collections.sort(allLines2);
        Collections.sort(forRemoveLines2);

        for (int i = 0; i < forRemoveLines2.size(); i++)
            if (!forRemoveLines2.get(i).equals(allLines2.get(i))){
                check = false;
            }
                else {
                    check = true;
            }

                if (check) {
                    for (int i = 0; i < forRemoveLines2.size(); i++)
                        for (int j = 0; j < allLines.size(); j++)
                           if(allLines.get(j).equals(forRemoveLines2.get(i)))
                               allLines.remove(j);
                } else {
                    for (int i = 0; i < allLines.size(); i++)
                        allLines.remove(i);
                    throw new CorruptedDataException();
                } */

    }
}
