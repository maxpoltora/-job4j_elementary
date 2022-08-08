package ru.job4j.calculator;

public class ArgMethod {

    public static void main(String[] args) {
        int result3 = func1(100);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }

    public static int func1(int x) {
        return x * x + 1;
    }

}
