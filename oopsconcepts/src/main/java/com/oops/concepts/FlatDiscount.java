package com.oops.concepts;

public class FlatDiscount extends Discount {

    private double amount;

    FlatDiscount(double amount) {
        this.amount = amount;
        this.label = "$" + amount + " off";
    }

    @Override
    public double apply(double price) {
        return price - this.amount;
    }
}
