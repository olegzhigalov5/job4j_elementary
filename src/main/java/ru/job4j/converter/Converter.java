package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        value = value / 70;
        return value;
    }

    public static float rubleToDollar(float value) {
        value = value / 60;
        return value;
    }

    public static void main(String[] args) {
        float value = 140;
        float euro = Converter.rubleToEuro(value);
        System.out.println(value + " rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(value);
        System.out.println(value + " rubles are " + dollar + " dollars.");
    }
}