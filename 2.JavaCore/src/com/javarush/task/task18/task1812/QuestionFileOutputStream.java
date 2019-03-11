package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream decorating;
    public QuestionFileOutputStream (AmigoOutputStream decorating){
        this.decorating = decorating;
    }

    public void flush() throws IOException {
        decorating.flush();
    }

    public void write(int b) throws IOException {
        decorating.write(b);
    }

    public void write(byte[] b) throws IOException {
        decorating.write(b);
    }

    public void write(byte[] b, int off, int len) throws IOException {
        decorating.write(b,off,len);
    }

    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н");
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        if (R.readLine().equals("Д"))
            decorating.close();
        R.close();
    }
}

