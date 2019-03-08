package com.javarush.task.task14.task1417;

public class Ruble extends Money {
    public double getAmount() {
        return 0;
    }

    public String getCurrencyName() {
        return "RUB";
    }

    public Ruble(double amount) {
        super(amount);
    }
}
