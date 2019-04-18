package com.javarush.task.task31.task3101;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) {
        File file = new File(args[0]);
        checknrename(file);
        File file2 = new File(args[1]);
        getFilesLess50b(file2);

    }

    private static void checknrename (File file){
        File dir = new File(file.getParent());
        File checking = new File(dir+"allFilesContent.txt");
        if (FileUtils.isExist(checking)) {
            System.out.println("File exists! Deleting...");
            FileUtils.deleteFile(checking);
            System.out.println("Renaming current file...");
        } else {
            System.out.println("File doesn't exist, renaming current file...");
        }
        FileUtils.renameFile(file, checking);
    }

    private static List<File> getFilesLess50b (File file) {
        List<File> arr = new ArrayList<>();

        return arr;
    }
}
