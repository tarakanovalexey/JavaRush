package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file1 = R.readLine();
        String file2 = R.readLine();
        R.close();
       /* String file1 = "D:\\text1.txt";
        String file2 = "D:\\text2.txt";*/
        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(file1));
        byte[] arr = new byte[buffer.available()];
        ArrayList<String> save = new ArrayList<>();
        while (buffer.available() > 0)
            buffer.read(arr);
        buffer.close();
        String parsing = "";
        for (int i = 0; i < arr.length; i++)
            if (arr[i] != (byte) ' ')
                parsing += (char) arr[i];
            else {
                save.add(parsing);
      //          System.out.println(parsing);
                parsing = "";
            }
        save.add(parsing);
      //  System.out.println(parsing);
      //  System.out.println(save);
        double[] darr = new double[save.size()];
        for (int i = 0; i < save.size(); i++) {
            darr[i] = Double.parseDouble(save.get(i));
        }
        /*for (int i = 0; i < darr.length; i++) {
            System.out.print(darr[i] + " ");
        }
        System.out.println("");*/
        int result;
        String[] iarr = new String[darr.length];
        for (int i = 0; i < darr.length; i++) {
            if (darr[i] > 0)
            result = (int) (darr[i] + 0.5);
            else result = (int) (darr[i] - 0.49);
     //       System.out.print(result + " ");
            iarr[i] = String.valueOf(result);
        }
      /*  System.out.println("");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        } */
    //    System.out.println("");
        String res = "";
      FileOutputStream output = new FileOutputStream(file2);
      for (int i = 0; i < iarr.length; i++) {
          res +=iarr[i];
          if (i < iarr.length-1)
              res +=" ";
      }
      output.close();
    //  System.out.println(res);
      output.write(res.getBytes());

    }
}
