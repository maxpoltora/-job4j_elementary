package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        double expected = 1;
        int x1 = 1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus10to20then3() {
        double expected = 3;
        int x1 = -1;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00toMinus20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = -2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assertions.assertEquals(expected, out, 0.01);
    }
}