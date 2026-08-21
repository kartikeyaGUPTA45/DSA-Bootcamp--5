package com.oops.concepts;

public abstract class Shape {

    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double area();
    abstract double perimeter();

    public void describe() {
        System.out.println("Shape: " + name + ", Area: " + area() + ", Perimeter: " + perimeter());
    }
}
