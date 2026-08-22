package com.oops.concepts;

import java.util.List;

public class Main {

    // Main is the starting point of code
    public static void main(String[] args) {
        Admin admin = new Admin("Admin", "abc", "Admin@gmail.com");
        admin.addUser();
        admin.deleteUser();
        System.out.println(admin.getUserAddress());

        System.out.println("***************");
        Customer customer = new Customer("Customer", "def", "customer@gmail.com");
        customer.placeOrder();
        customer.cancelOrder();
        System.out.println(customer.getUserName());

        System.out.println("*******************");
        Vendor vendor = new Vendor("Vendor", "ghi", "vendor@gmail.com");
        vendor.addProduct();
        vendor.removeProduct();
        vendor.updateProduct();
        System.out.println(vendor.getUserAddress());

    }
}