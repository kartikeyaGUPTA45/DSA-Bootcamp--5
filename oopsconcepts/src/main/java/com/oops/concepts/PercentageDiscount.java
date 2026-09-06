package com.oops.concepts;

public class PercentageDiscount extends Discount {
    private int percentage;

    PercentageDiscount(int percentage) {
        this.percentage = percentage;
        this.label = percentage + "% off";
    }

    @Override
    public double apply(double price) {
        return price*(1.0  - (double)this.percentage / 100.0);
    }
}
