package com.oops.concepts;

public class ConsoleLog implements  Log {

    @Override
    public void log(String level, String message) {
        System.out.println("Console log: " + level + ", message: " + message);
    }

    @Override
    public String getDestination() {
        return "Console";
    }
}
