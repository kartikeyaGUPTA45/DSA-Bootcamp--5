package com.oops.concepts;

public class User {

    public String name;
    public String address;

    public void placeOrder(int orderId) {
        System.out.println("Order with order Id: " + orderId + " placed successfully");
    }

    public String getUserName() {
        return this.name;
    }

    public String getUserAddress() {
        return this.address;
    }

}
