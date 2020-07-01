package ru.synergyit.service;
import ru.synergyit.TemperatureConverterObject;
import ru.synergyit.service.impl.*;
import ru.synergyit.type.TemperatureType;

public interface TemperatureConverter {
    double convert(double temp);

    static TemperatureConverter getInstance(TemperatureConverterObject converterObject) {
        TemperatureType type = converterObject.getType ();
        return type.getConverter ();
    }

    static double convert (TemperatureConverterObject converterObject) {
        return getInstance (converterObject).convert ( converterObject.getTemperature () );
    }
}
