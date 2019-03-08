package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {

    int getCountOfEggsPerMonth() {
        return 60;
    }

    String getDescription(){
        return super.getDescription()+" Моя страна - "+MOLDOVA+". Я несу "+getCountOfEggsPerMonth()+" яиц в месяц.";
    }
}
