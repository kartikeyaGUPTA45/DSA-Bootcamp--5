package com.oops.concepts;

import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor {
    private List<Double> readings = new ArrayList<>();

    public void addReading(double reading) {
        if (reading >= -50 && reading <= 150) {
            readings.add(reading);
        }
    }

    public double getAverage() {
        if (readings.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double reading : readings) {
            sum += reading;
        }
        return sum / readings.size();
    }

    public int getReadingCount() {
        return readings.size();
    }

    public List<Double> getReadings() {
        return new ArrayList<>(readings);
    }

}
