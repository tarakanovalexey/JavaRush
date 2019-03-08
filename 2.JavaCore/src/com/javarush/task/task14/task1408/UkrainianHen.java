package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {

    int getCountOfEggsPerMonth() {
        return 65;
    }

    String getDescription(){
        return super.getDescription()+" Моя страна - "+UKRAINE+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
