package com.javarush.task.task31.task3106;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;
import java.util.zip.ZipInputStream;

/*
Разархивируем файл
*/
public class Solution {
    public static void main(String[] args) throws IOException {
       // args[0] - имя результирующего файла resultFileName
       // args[1..n] - куски zip архив
        ArrayList<String> zipPartsNames = new ArrayList<>();
        for (int i = 1; i < args.length; i++){
            zipPartsNames.add(args[i]);
        }
        Collections.sort(zipPartsNames);
        Vector<FileInputStream> zipPartsFIS = new Vector<>();
        for (String each : zipPartsNames) {
            zipPartsFIS.add(new FileInputStream(each));
        }

        try (FileOutputStream fileOutputStream = new FileOutputStream(args[0])) {
            try (ZipInputStream zipOutputStream = new ZipInputStream(new SequenceInputStream(zipPartsFIS.elements()))) {

                byte[] buffer = new byte[1024];
                while ((zipOutputStream.getNextEntry()) != null) {
                    int count;
                    while ((count = zipOutputStream.read(buffer)) != -1) {
                        fileOutputStream.write(buffer, 0, count);
                    }
                }
            }
        }


    }

}
