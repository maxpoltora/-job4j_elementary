package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i <= width; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= height; j++) {
                sb.append(isSumEven(i, j));
            }
            System.out.println(sb);
        }
    }

    public static char isSumEven(int x, int y) {
        int sum = 0;
        if ((x + y) % 2 == 0) {
            return '#';
        } else {
            return ' ';
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(4, 4);
    }
}
