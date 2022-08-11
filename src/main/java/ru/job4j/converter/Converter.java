package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToRuble(float value) {
        return value * 70;
    }

    public static float dollarToRuble(float value) {
        return value * 60;
    }

    public static void main(String[] args) {
        float in = 120;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println(in + " rubles are 2. Test result : " + passed);
    }
}
