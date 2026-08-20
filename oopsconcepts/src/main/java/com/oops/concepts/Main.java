package com.oops.concepts;

public class Main {

    // Main is the starting point of code
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem("Laptop", 1000.0);
        shoppingCart.addItem("Phone", 500.0);
        shoppingCart.applyDiscount("SAVE10");
        System.out.println("Total: " + shoppingCart.getTotal());
        shoppingCart.checkout();

    }
}