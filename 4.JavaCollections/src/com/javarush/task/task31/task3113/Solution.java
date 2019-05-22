package com.javarush.task.task31.task3113;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;

/* 
Что внутри папки?
*/
public class Solution {


    public static void main(String[] args) throws IOException {
        final int[] countDirs = {-1};
        final int[] countFiles = {0};
        final long[] countSize = {0};
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Path pathToDir = Paths.get(bufferedReader.readLine());
        bufferedReader.close();
        if (!Files.isDirectory(pathToDir)) {
            System.out.println(pathToDir.toAbsolutePath().toString()+" - не папка");
            return;
        }
        Files.walkFileTree(pathToDir, new FileVisitor<Path>(){
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                return CONTINUE;
            }

            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                countFiles[0]++;
                countSize[0] += attrs.size();
                return CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
                return CONTINUE;
            }

            @Override
            public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
                countDirs[0]++;
                return CONTINUE;
            }
        });
        System.out.println("Всего папок - "+ countDirs[0]);
        System.out.println("Всего файлов - "+ countFiles[0]);
        System.out.println("Общий размер - "+countSize[0]);
    }


}
