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
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        float ruEur = Converter.euroToRuble(140);
        float ruDoll = Converter.dollarToRuble(140);
        System.out.println("140 Rubles are " + euro + " euro.");
        System.out.println("140 Rubles are " + dollar + " dollar.");
        System.out.println("140 Euro are " + ruEur + " rubles.");
        System.out.println("140 Dollar are " + ruDoll + " rubles.");
    }
}
