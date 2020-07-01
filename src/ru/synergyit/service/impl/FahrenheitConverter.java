package ru.synergyit.service.impl;

import ru.synergyit.service.TemperatureConverter;

public class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convert(double temp) {
        double temperature = (temp * 9) / 5 + 32;
        return temperature;
    }
}
