package com.oops.concepts;

public class ImplAbc extends abc {

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public void printName() {
        System.out.println("printName method: " + super.name);
    }
}
