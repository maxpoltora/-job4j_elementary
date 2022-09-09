package ru.job4j.array;

import java.util.Arrays;

//жадный алгоритм для кофемашины
public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;

        for (int coin : coins) {
            while (coin <= money - price) {
                money -= coin;
                rsl[size] = coin;
                size++;
            }

        }
//усекает массив до размера size
        return Arrays.copyOf(rsl, size);
    }

}