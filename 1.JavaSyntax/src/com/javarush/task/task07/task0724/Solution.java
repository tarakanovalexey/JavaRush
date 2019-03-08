package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Human ded1 = new Human("Ded1", true, 75);
        Human ded2 = new Human("Ded2", true, 71);
        Human bab1 = new Human("Baba1", false, 70);
        Human bab2 = new Human("Baba2", false, 69);
        Human papa = new Human("Papa", true, 46, ded1, bab1);
        Human mama = new Human("Mama", false, 47, ded2, bab2);
        Human child1 = new Human("Child1", false, 15, papa, mama);
        Human child2 = new Human("Child2", true, 12, papa, mama);
        Human child3 = new Human("Child3", true, 6, papa, mama);

        System.out.println(ded1);
        System.out.println(ded2);
        System.out.println(bab1);
        System.out.println(bab2);
        System.out.println(papa);
        System.out.println(mama);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);

    }

    public static class Human  {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}