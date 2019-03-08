package com.javarush.task.task14.task1417;

public class Hrivna extends Money {
    public double getAmount() {
        return 0;
    }

    public String getCurrencyName() {
        return "UAH";
    }

    public Hrivna(double amount) {
        super(amount);
    }
}
