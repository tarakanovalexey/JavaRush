package com.javarush.task.task33.task3310;

import com.javarush.task.task33.task3310.strategy.HashMapStorageStrategy;
import com.javarush.task.task33.task3310.strategy.StorageStrategy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        testStrategy(new HashMapStorageStrategy(), 1000);
    }

    public static Set<Long> getIds(Shortener shortener, Set<String> strings) {
        Set<Long> set = new HashSet<>();
        for (String each : strings){
            set.add(shortener.getId(each));
        }
        return set;
    }

    public static Set<String> getStrings(Shortener shortener, Set<Long> keys){
        Set<String> set = new HashSet<>();
        for (Long each : keys){
            set.add(shortener.getString(each));
        }
        return set;
    }

    public static void testStrategy(StorageStrategy strategy, long elementsNumber) {
        Helper.printMessage(strategy.getClass().getSimpleName());
        Set<String> set = new HashSet<>();
        for (long i = 0L; i < elementsNumber; i++){
            set.add(Helper.generateRandomString());
        }
        Shortener shortener = new Shortener(strategy);
        Date date = new Date();
        Set<Long> setIds = getIds(shortener, set);
        Date date2 = new Date();
        Helper.printMessage(String.valueOf(date2.getTime()-date.getTime()));
        date = new Date();
        Set<String> setStrings = getStrings(shortener, setIds);
        date2 = new Date();
        Helper.printMessage(String.valueOf(date2.getTime()-date.getTime()));
        if (setStrings.equals(set))
            Helper.printMessage("Тест пройден.");
        else Helper.printMessage("Тест не пройден.");
    }
}
