package com.oops.concepts;

import java.util.List;

public class Main {

    // Main is the starting point of code
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.processOrder("Laptop", 10000, new FlatDiscount(1000));
        orderProcessor.processOrder("Laptop", 10000, new PercentageDiscount(10));
        orderProcessor.processOrder("Laptop", 10000, new BuyOneGetOneDiscount());
    }
}