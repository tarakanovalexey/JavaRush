package com.javarush.task.task18.task1813;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
AmigoOutputStream
*/

public class AmigoOutputStream extends FileOutputStream {
    public static String fileName = "C:/tmp/result.txt";
    private FileOutputStream decor;
    public AmigoOutputStream (FileOutputStream decor) throws IOException{
        super(fileName);
        this.decor = decor;
    }

    @Override
    public void write(int b) throws IOException {
        decor.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        decor.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        decor.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        decor.flush();
        write("JavaRush © All rights reserved.".getBytes());
        decor.close();
    }

    @Override
    public void flush() throws IOException {
        decor.flush();
    }

    public static void main(String[] args) throws IOException {
        new AmigoOutputStream(new FileOutputStream(fileName));
    }

}
