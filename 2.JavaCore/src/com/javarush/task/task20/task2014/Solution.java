package com.javarush.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/
public class Solution implements Externalizable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File tempFile = File.createTempFile("temp.tmp", null);

        OutputStream output = new FileOutputStream(tempFile);
        ObjectOutputStream objectOutput = new ObjectOutputStream(output);
        Solution savedObject = new Solution(20);
        System.out.println(savedObject);
        objectOutput.writeObject(savedObject);
        objectOutput.flush();
        objectOutput.close();

        InputStream input = new FileInputStream(tempFile);
        ObjectInputStream objectInput = new ObjectInputStream(input);
        Solution loadedObject = new Solution(100);
        System.out.println(loadedObject);
        loadedObject = (Solution) objectInput.readObject();
        System.out.println(loadedObject);
        System.out.println(savedObject.string.equals(loadedObject.string));
        objectInput.close();
    }

    transient private final String pattern = "dd MMMM yyyy, EEEE";
    transient private Date currentDate;
    transient private int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    public Solution (){

    }

    @Override
    public String toString() {
        return this.string;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(string);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        string = (String) in.readObject();

    }
}
