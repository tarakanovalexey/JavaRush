package com.javarush.task.task22.task2207;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/* 
Обращенные слова
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        reader.close();
        BufferedReader reader1 = new BufferedReader(new FileReader(text));
        StringBuilder builder = new StringBuilder();
        while (reader1.ready()) {
            builder.append(reader1.readLine());
            if (reader1.ready())
                builder.append(" ");
        }
        String[] arr = builder.toString().split(" ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++)
            if ((arr[i].equals(new StringBuilder(arr[j]).reverse().toString())) && i!=j && !arr[i].equals("")) {
                result.add(new Pair(arr[i], arr[j]));
                arr[i] = "";
                arr[j] = "";
            }
        }
        for (Pair each : result)
            System.out.println(each);
    }

    public static class Pair {
        String first;
        String second;

        public Pair() {
        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
