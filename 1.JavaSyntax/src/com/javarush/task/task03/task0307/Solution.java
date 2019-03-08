package com.javarush.task.task03.task0307;

/* 
Привет StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Zerg sobaka1 = new Zerg();
        sobaka1.name = "sobaka1";
        Zerg sobaka2 = new Zerg();
        sobaka2.name = "sobaka2";
        Zerg sobaka3 = new Zerg();
        sobaka3.name = "sobaka3";
        Zerg sobaka4 = new Zerg();
        sobaka4.name = "sobaka4";
        Zerg sobaka5 = new Zerg();
        sobaka5.name = "sobaka5";

        Protoss zilot1 = new Protoss();
        zilot1.name = "zilot1";
        Protoss zilot2 = new Protoss();
        zilot2.name = "zilot2";
        Protoss zilot3 = new Protoss();
        zilot3.name = "zilot3";

        Terran destructor1 = new Terran();
        destructor1.name = "destructor1";
        Terran destructor2 = new Terran();
        destructor2.name = "destructor2";
        Terran destructor3 = new Terran();
        destructor3.name = "destructor3";
        Terran destructor4 = new Terran();
        destructor4.name = "destructor4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
