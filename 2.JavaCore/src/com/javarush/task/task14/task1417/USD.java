package com.javarush.task.task14.task1417;

public class USD extends Money {
    public double getAmount() {
        return 0;
    }

    public String getCurrencyName() {
        return "USD";
    }

    public USD(double amount) {
        super(amount);
    }
}
