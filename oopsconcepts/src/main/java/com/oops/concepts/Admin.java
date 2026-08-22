package com.oops.concepts;

public class Admin extends User {

    public Admin(String name, String address, String email) {
        super(name, address, email);
    }

    public void deleteUser() {
        System.out.println("User deleted successfully");
    }

    public void addUser() {
        System.out.println("User added successfully");
    }
}

