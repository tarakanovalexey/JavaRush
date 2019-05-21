package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        return Files.walk(Paths.get(root))
                .filter(Files::isRegularFile)
                .map(Path::toString)
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        
    }
}
