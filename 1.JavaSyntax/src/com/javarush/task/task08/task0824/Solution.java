package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human child1 = new Human("сын Паша", true, 21, null);
        Human child2 = new Human("дочь Кристина", false, 16, null);
        Human child3 = new Human("дочь Марина", false, 10, null);

        ArrayList<Human> papa1c = new ArrayList<>();
        papa1c.add(child1);
        papa1c.add(child2);
        papa1c.add(child3);

        Human papa = new Human("папа Сережа", true, 45, papa1c);
        Human mama = new Human("мама Наташа", false, 43, papa1c);

        ArrayList<Human> ded1c = new ArrayList<>();
        ded1c.add(papa);
        ArrayList<Human> ded2c = new ArrayList<>();
        ded2c.add(mama);
        Human ded1 = new Human("дед Витя", true, 79, ded1c);
        Human ded2 = new Human("дед Саша", true, 75, ded2c);
        Human bab1 = new Human("баба Валя", false, 76, ded1c);
        Human bab2 = new Human("баба Маша", false, 69, ded2c);

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

    public static class Human {
        String name;
        Boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, Boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.children != null) {
                int childCount = this.children.size();
                if (childCount > 0) {
                    text += ", дети: " + this.children.get(0).name;

                    for (int i = 1; i < childCount; i++) {
                        Human child = this.children.get(i);
                        text += ", " + child.name;
                    }
                }
            }
            return text;
        }
    }

}
