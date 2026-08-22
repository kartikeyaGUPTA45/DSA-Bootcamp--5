package com.oops.concepts;

import java.util.List;

public class Main {

    // Main is the starting point of code
    public static void main(String[] args) {
        DataExporter csv = new CSVExporter();
        csv.export(List.of("Hello", "World"));

        DataExporter json = new JSONExporter();
        json.export(List.of("Hello", "World"));

    }
}