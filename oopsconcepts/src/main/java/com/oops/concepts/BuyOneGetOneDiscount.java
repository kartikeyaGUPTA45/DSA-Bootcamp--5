package com.oops.concepts;

public class BuyOneGetOneDiscount extends Discount {

    public BuyOneGetOneDiscount() {
        this.label = "Buy 1 Get 1 Free";
    }

    @Override
    public double apply(double price) {
        return price / 2;
    }
}
