package com.oops.concepts;

public class Calculator {

    public int add(int a, int b) {
        System.out.println("Inside int 2 para");
        return a + b;
    }

    public int add(int a, int b, int c) {
        System.out.println("Inside int 3 para");
        return a + b + c;
    }

    public double add(double a, double b) {
        System.out.println("Inside double 2 para");
        return a + b;
    }

    public double add(double a, double b, double c) {
        System.out.println("Inside double 3 para");
        return a + b + c;
    }
}
