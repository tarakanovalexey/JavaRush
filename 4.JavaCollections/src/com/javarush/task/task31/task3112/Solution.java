package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/* 
Загрузчик файлов
*/
public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("D:/MyDownloads"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);
        Path tempPath = Files.createTempFile("temp-", ".tmp");
        Files.copy(url.openStream(), tempPath, StandardCopyOption.REPLACE_EXISTING);
        Path passwordsFile = Paths.get(downloadDirectory.toAbsolutePath().toString()+"/"+Paths.get(url.getFile()).getFileName().toString());
        Files.move(tempPath, passwordsFile);
        return passwordsFile;
    }
}
