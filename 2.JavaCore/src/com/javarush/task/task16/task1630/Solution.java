package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        try{
        firstFileName = R.readLine();
        secondFileName = R.readLine();
        R.close();
        }
        catch (IOException e) {}
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {

        String filename;
        ArrayList<String> list = new ArrayList<>();
        String text = "";

        public void setFileName(String fullFileName) {
            this.filename = fullFileName;
        }

        public String getFileContent() {
            for (int i = 0; i < list.size(); i++) {
                text = text + list.get(i);
                if (i < list.size()-1) text += " ";
            }
            return text;
        }

        public void run() {
            String line = "";
            try {
                BufferedReader fileReader = new BufferedReader(new FileReader(filename));
                while ((line = fileReader.readLine()) != null)
                    list.add(line);
                fileReader.close();
            } catch (IOException e) {}
        }
    }

    //add your code here - добавьте код тут
}
