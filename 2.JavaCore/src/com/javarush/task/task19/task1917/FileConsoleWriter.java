package com.javarush.task.task19.task1917;

/* 
Свой FileWriter
*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;
    public static void main(String[] args) {

    }
    FileConsoleWriter(File file) throws IOException {
        fileWriter = new FileWriter(file);
    }

    FileConsoleWriter(File file, boolean append) throws IOException {
        fileWriter = new FileWriter(file, append);
}

    FileConsoleWriter(FileDescriptor fd) throws IOException {
        fileWriter = new FileWriter(fd);
    }

    FileConsoleWriter(String fileName) throws IOException {
        fileWriter = new FileWriter(fileName);
    }

    FileConsoleWriter(String fileName, boolean append) throws IOException {
        fileWriter = new FileWriter(fileName, append);
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        this.fileWriter.write(cbuf, off, len);
        for (int i = off; i < len+off; i++) {
            System.out.print(cbuf[i]);
        }
    }
    public void write(int c) throws IOException {
        this.fileWriter.write(c);
        System.out.println(c);
    }
    public void write(String str) throws IOException {
        this.fileWriter.write(str);
        System.out.println(str);
    }
    public void write(String str, int off, int len) throws IOException {
        this.fileWriter.write(str, off, len);
        System.out.print(str.substring(off,len+off));
    }
    public void write(char[] cbuf) throws IOException {
            this.fileWriter.write(cbuf);
        for (int i = 0; i < cbuf.length; i++ ) {
            System.out.print(cbuf[i]);
        }
    }
    public void close() throws IOException {
        this.fileWriter.close();
    }

}
