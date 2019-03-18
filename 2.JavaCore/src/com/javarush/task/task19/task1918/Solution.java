package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        String file = R.readLine();
        R.close();
        FileReader input = new FileReader(file);
        String text = "";
        while (input.ready()){
            text += (char) input.read();
        }
        input.close();
        Elements elem = Jsoup.parse(text, args[0], Parser.xmlParser()).getElementsByTag(args[0]);
        String out = "";
        for (Element each : elem)
            out += each.toString()+"\n";
        System.out.print(out);

    }
}
