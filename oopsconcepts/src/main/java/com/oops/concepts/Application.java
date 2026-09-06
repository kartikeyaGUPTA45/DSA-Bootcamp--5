package com.oops.concepts;

public class Application {
    private Log log;

    public Application(Log log) {
        this.log = log;
    }

    public void run() {
        System.out.println("Logging to: " + log.getDestination());
        this.log.log("INFO", "Application is running");
    }
}
