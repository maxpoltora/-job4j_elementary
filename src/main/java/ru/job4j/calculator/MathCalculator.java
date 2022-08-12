package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
         + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double summOperationDifferenceDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double summAllOperation(double first, double second) {
        return difference(first, second) + division(first, second) + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + summOperationDifferenceDivision(10, 20));
        System.out.println("Результат расчета равен: " + summAllOperation(10, 20));
    }
}
