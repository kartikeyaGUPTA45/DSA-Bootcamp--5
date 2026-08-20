package com.oops.concepts;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main { // Main is the starting point of code
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor();
        temperatureSensor.addReading(123.23);

        System.out.println(temperatureSensor.getAverage());
        System.out.println(temperatureSensor.getReadingCount());
        System.out.println(temperatureSensor.getReadings());

        temperatureSensor.addReading(-30);
        temperatureSensor.addReading(34);
        temperatureSensor.addReading(45.22);

        System.out.println(temperatureSensor.getAverage());
        System.out.println(temperatureSensor.getReadingCount());
        System.out.println(temperatureSensor.getReadings());

    }
}