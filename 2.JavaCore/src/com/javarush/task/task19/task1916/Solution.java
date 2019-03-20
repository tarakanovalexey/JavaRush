package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        R.close();

        List<String> arr1 = new ArrayList<>();
        BufferedReader input1 = new BufferedReader(new FileReader(file1));
        while (input1.ready())
            arr1.add(input1.readLine());
        input1.close();

        List<String> arr2 = new ArrayList<>();
        BufferedReader input2 = new BufferedReader(new FileReader(file2));
        while (input2.ready())
            arr2.add(input2.readLine());
        input2.close();

        while (arr1.size() > 0 && arr2.size() > 0) {

            if (arr1.get(0).equals(arr2.get(0))) {
                lines.add(new LineItem(Type.SAME, arr1.get(0)));
                arr1.remove(0);
                arr2.remove(0);
            } else {
                if (arr1.size() > 0) {
                    if (arr1.get(1).equals(arr2.get(0))) {
                        lines.add(new LineItem(Type.REMOVED, arr1.get(0)));
                        arr1.remove(0);
                    }
                }

                if (arr2.size() > 0) {
                    if (arr1.get(0).equals(arr2.get(1))) {
                        lines.add(new LineItem(Type.ADDED, arr2.get(0)));
                        arr2.remove(0);
                    }
                }
            }
        }

        if (arr1.size()>0){
            lines.add(new LineItem(Type.REMOVED, arr1.get(0)));
        }

        if (arr2.size()>0){
            lines.add(new LineItem(Type.ADDED, arr2.get(0)));
        }

    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
