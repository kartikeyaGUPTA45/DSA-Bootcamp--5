package com.oops.concepts;

import javax.xml.crypto.Data;
import java.util.List;

public class Main {

    // Main is the starting point of code
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "John";
        student.age = "20";
        student.rollNumber = "1";

        System.out.println(student.name + " " + student.age +  " " + student.rollNumber + " " + Student.school);
    }
}