package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("result (" + x1 + ", " + x2 + ") to (" + y1 + ", " + y2 + ") = " + result);
        return result;
    }

    public static void main(String[] args) {
        double x0 = distance(10, 5, 4, 2);
        double x1 = distance(1, 8, -4, -2);
        double x2 = distance(10, 15, 12, 7);
        double x3 = distance(20, 5, 8, -2);
    }
}
