package ru.synergyit;
import ru.synergyit.service.TemperatureConverter;

import java.util.Scanner;
public class ConverterRunner {
    public ConverterRunner() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TemperatureConverterObject converterObject = new TemperatureConverterObject();
        System.out.println("type country for calculation:");
        converterObject.setCountry(scanner.nextLine());
        System.out.println("type value for conversion:");
        double temperature = scanner.nextDouble();
        converterObject.setTemperature(temperature);
        double convertedValue = TemperatureConverter.convert(converterObject);
        System.out.println(convertedValue);
    }

}
