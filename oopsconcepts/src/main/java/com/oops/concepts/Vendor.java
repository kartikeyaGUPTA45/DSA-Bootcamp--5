package com.oops.concepts;

public class Vendor extends User {

    public Vendor(String name, String address, String email) {
        super(name, address, email);
    }

    public void addProduct() {
        System.out.println("Product added successfully");
    }

    public void removeProduct() {
        System.out.println("Product removed successfully");
    }

    public void updateProduct() {
        System.out.println("Product updated successfully");
    }
}
