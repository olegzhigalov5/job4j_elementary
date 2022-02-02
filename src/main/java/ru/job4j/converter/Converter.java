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

        float in = 140f;
        float expectedEuro = 2f;
        float expectedDollar = 2.3333333f;
        float outDollar = Converter.rubleToDollar(in);
        float outEuro = Converter.rubleToEuro(in);
        boolean passedDollar = expectedDollar == outDollar;
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("            Test results: ");
        System.out.println("140 rubles are " + expectedEuro + ". Test result : " + passedEuro);
        System.out.println("140 rubles are " + expectedDollar + ". Test result : " + passedDollar);
    }
}