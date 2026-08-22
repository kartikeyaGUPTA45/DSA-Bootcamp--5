package com.oops.concepts;

import java.util.List;

public abstract class DataExporter {

    boolean validate(List<String> data) {
        if (data == null || data.isEmpty()) {
            System.out.println("Export failed: No data present!!!");
            return false;
        }

        System.out.println("Validation passed");
        return true;
    }

    public abstract void export(List<String> data);
}
