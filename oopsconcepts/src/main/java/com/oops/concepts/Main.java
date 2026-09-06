package com.oops.concepts;

import javax.xml.crypto.Data;
import java.util.List;

public class Main {

    // Main is the starting point of code
    public static void main(String[] args) {
        Log log = new DatabaseLog();
        Application app = new Application(log);
        app.run();
    }
}