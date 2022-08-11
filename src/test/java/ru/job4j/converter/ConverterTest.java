package ru.job4j.converter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;


import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert180RblThen3Dlr() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }

    @Test
    void when2euroToRublethen140Rub() {
        float in = 2;
        float expected = 140;
        float out = Converter.euroToRuble(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }

    @Test
    void dollarToRuble() {
        float in = 3;
        float expected = 180;
        float out = Converter.dollarToRuble(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }
}