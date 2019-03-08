package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandfatherName, null, null);

        String grandmotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandmotherName, null, null);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGrandFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMother, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentm;
        private Cat parentp;

        Cat(String name, Cat parentm, Cat parentp) {
            this.name = name;
            this.parentm = parentm;
            this.parentp = parentp;
        }

        @Override
        public String toString() {

            if (parentm != null && parentp != null)
                return "The cat's name is " + name + ", mother is " + parentm.name + ", father is " + parentp.name;

            if (parentm == null && parentp == null)
                return "The cat's name is " + name + ", no mother , no father";

            if (parentp == null)
                return "The cat's name is " + name + ", mother is " + parentm.name + ", no father";

            if (parentm == null)
                return "The cat's name is " + name + ", no mother,father is " + parentp.name;

            else return "";
        }
    }

}
