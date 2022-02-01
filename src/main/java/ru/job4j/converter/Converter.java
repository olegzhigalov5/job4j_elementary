package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
              return value / 70;
    }

    public static float rubleToDollar(float value) {
            return value / 60;
    }

    public static void main(String[] args) {
        float value = 140;
        float euro = Converter.rubleToEuro(value);
        System.out.println(value + " rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(value);
        System.out.println(value + " rubles are " + dollar + " dollars.");
    }
}