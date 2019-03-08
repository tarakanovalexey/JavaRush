package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {

    int getCountOfEggsPerMonth() {
        return 55;
    }

    String getDescription(){
        return super.getDescription()+" Моя страна - "+RUSSIA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
