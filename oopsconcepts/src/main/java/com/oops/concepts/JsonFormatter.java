package com.oops.concepts;

public class JsonFormatter implements Formatter {

    public String format(String message) {
        return "{\"log\": \"" + message + " \"}";
    }
}
