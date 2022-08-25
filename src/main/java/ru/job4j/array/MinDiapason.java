package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int findMinIndex(int[] array, int start, int finish) {
        int min = array[start];
        int indexElement = -1;
        for (int i = start; i <= finish; i++) {
            if (array[i] < min) {
                min = array[i];
                indexElement = i;
            }
        }
        return indexElement;
    }
}
