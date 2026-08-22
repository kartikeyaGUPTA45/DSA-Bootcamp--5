package com.oops.concepts;

public class Customer extends User {

    public Customer(String name, String address, String email) {
        super(name, address, email);
    }

    public void placeOrder() {
        System.out.println("Order placed successfully");
    }

    public void cancelOrder() {
        System.out.println("Order cancelled successfully");
    }
}
