package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP120K5Square2() {
        int expected = 500;
        int p = 120;
        double k = 5;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP144K2Square1152() {
        int expected = 1152;
        int p = 144;
        double k = 2;
        double out = SqArea.square(p, k);
        Assertions.assertEquals(expected, out, 0.01);
    }
}