package com.oops.concepts;

public class Logger {
    public Formatter formatter;

    public Logger(Formatter formatter) {
        this.formatter = formatter;
    }

    public void log(String message) {
        System.out.println(formatter.format(message));
    }
}
