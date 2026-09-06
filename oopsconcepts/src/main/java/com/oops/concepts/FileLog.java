package com.oops.concepts;

public class FileLog implements  Log {

    @Override
    public void log(String level, String message) {
        System.out.println("File log: " + level + ", message: " + message);
    }

    @Override
    public String getDestination() {
        return "File";
    }
}
