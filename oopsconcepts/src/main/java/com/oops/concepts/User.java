package com.oops.concepts;

public class User {

    private String name;
    private String address;
    private String email;

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
