package ru.synergyit.type;

import ru.synergyit.service.impl.CelsiusConverter;
import ru.synergyit.service.impl.FahrenheitConverter;
import ru.synergyit.service.impl.KelvinConverter;
import ru.synergyit.service.TemperatureConverter;

import java.util.Objects;

public enum TemperatureType {
    FAHRENHEIT ( new String[] { "USA" } , new FahrenheitConverter () ),
    KELVIN ( new String[] { "GB" } , new KelvinConverter () ),
    CELSIUS ( new String[] { "RU" } , new CelsiusConverter ()),
    UNKNOWN ( new String[] {},null );

    TemperatureType(String[] str , TemperatureConverter converter) {
        this.values = str;
        this.converter = converter;
    }

    private String values[];
    private TemperatureConverter converter;

    public String[] getValues() {
        return values;
    }

    public boolean belongToCountry(String country) {
        for (String value : values) {
            if (Objects.equals ( country , value )) {
                return true;
            }
        }
        return false;
    }

    public TemperatureConverter getConverter() {
        if (this.converter == null){
            throw new IllegalArgumentException ( "Please check params" );

        }
        return  this.converter;
    }
}
