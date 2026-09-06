package com.oops.concepts;

public class DatabaseLog implements  Log {
    @Override
    public void log(String level, String message) {
        System.out.println("Database Log: " + level + ", message: " + message);
    }

    @Override
    public String getDestination() {
        return "Database";
    }
}
