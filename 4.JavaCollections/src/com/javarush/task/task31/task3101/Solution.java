package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Проход по дереву файлов
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //args[0] - путь к файлам
        //args[1] - путь к файлу для записи
        File path = new File(args[0]);
        File resultFileAbsolutePath = new File(args[1]);
        File newFile = new File(resultFileAbsolutePath.getParent()+"/allFilesContent.txt");
        if (FileUtils.isExist(newFile)) {
            FileUtils.deleteFile(newFile);
        }
        List<File> list = addFiles(path);
        list.sort(Comparator.comparing(File::getName));
        FileUtils.renameFile(resultFileAbsolutePath, newFile);
        try (FileOutputStream out = new FileOutputStream(newFile, true)) {
            for (File each : list) {
                try (FileInputStream in = new FileInputStream(each.getAbsoluteFile())) {
                        while (in.available() > 0) {
                            out.write(in.read());
                        }
                        out.write(System.lineSeparator().getBytes());
                        out.flush();
                }
            }
        }
    }

    public static List<File> addFiles(File file){
        List<File> list = new ArrayList<>();
        if (file.listFiles() != null)
        for (File each : file.listFiles()){
            if (each.isFile() && each.length() <= 50)
            list.add(each);
            else if (each.isDirectory())
                list.addAll(addFiles(each));
        }
        return list;
    }
}
