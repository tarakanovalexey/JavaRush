package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/* 
Добавление файла в архив
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //args[0] - filename полный путь
        //args[1] - путь к zip-архиву
        //Добавить файл (fileName) внутрь архива в директорию 'new'.
        //Если в архиве есть файл с таким именем, то заменить его.
        HashMap<String, ByteArrayOutputStream> hashMap = new HashMap<>();
        try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(args[1]))) {
            ZipEntry zipEntry;
            while ((zipEntry = zipInputStream.getNextEntry()) != null) {
                try (ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
                    byte[] buffer = new byte[1024];
                    int count = 0;
                    while ((count = zipInputStream.read(buffer)) != -1)
                        byteArrayOutputStream.write(buffer, 0, count);

                    hashMap.put(zipEntry.getName(), byteArrayOutputStream);
                }
            }
        }

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(args[1]))) {
            File file = new File(args[0]);
            zipOutputStream.putNextEntry(new ZipEntry("new/"+file.getName()));
            Files.copy(file.toPath(), zipOutputStream);
            zipOutputStream.closeEntry();
            Path newFilePath = Paths.get(args[0]);
            String newFileName= newFilePath.getFileName().toString();
            for (Map.Entry<String, ByteArrayOutputStream> each : hashMap.entrySet()) {
                if (!each.getKey().equals(newFileName) && !each.getKey().equals("new/" + newFileName)) {
                        zipOutputStream.putNextEntry(new ZipEntry(each.getKey()));
                        zipOutputStream.write(each.getValue().toString().getBytes());
                        zipOutputStream.closeEntry();
                }
            }
        }
    }
}
