package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int minVal = MinDiapason.findMinIndex(data, i, data.length - 1);
            if (minVal == -1) {
                break;
            }

            int temp = data[i];
            data[i] = data[minVal];
            data[minVal] = temp;
        }
        return data;
    }
}
