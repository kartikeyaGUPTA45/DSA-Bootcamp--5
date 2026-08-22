package com.oops.concepts;

public class User {

    protected String name;
    protected String address;
    protected String email;

    public User(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
    }

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
