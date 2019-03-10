package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            FileInputStream input = new FileInputStream(R.readLine());
            if (input.available() < 1000) {
                R.close();
                input.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}
