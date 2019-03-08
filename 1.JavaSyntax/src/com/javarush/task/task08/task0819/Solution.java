package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat text: cats) System.out.println(text);
    }

    // step 1 - пункт 1
    public static class Cat{
        public Cat(){
        }
    }
}
