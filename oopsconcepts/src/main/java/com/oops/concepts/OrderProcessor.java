package com.oops.concepts;

public class OrderProcessor {

    public void processOrder(String itemName, double price, Discount discount) {
        System.out.println("Item is: " + itemName + " " + discount.describe(price));
    }
}
