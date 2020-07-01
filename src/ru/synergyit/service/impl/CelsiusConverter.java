package ru.synergyit.service.impl;

import ru.synergyit.service.TemperatureConverter;

public class CelsiusConverter implements TemperatureConverter {
    public double convert(double temp) {
        double temperature = temp * 9 / 5 + 32;
        System.out.println ( "Fahrenheit" );
        return temperature;
    }
}
