package com.oops.concepts;

public abstract class Discount {

    protected String label;

    public abstract double apply(double price);

    public String describe(double price) {
        return this.label + ": $"  + price + " -> $" + this.apply(price);
    }
}
