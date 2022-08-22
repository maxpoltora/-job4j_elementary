package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean canDivBy5;

        canDivBy5 = number != 1;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                canDivBy5 = false;
                break;
            }
        }

        return canDivBy5;
    }
}
