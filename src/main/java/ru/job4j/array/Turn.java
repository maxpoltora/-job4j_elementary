package ru.job4j.array;

public class Turn {

//    public static int[] back(int[] array) {
//        int[] tempArray = new int[array.length];
//        for (int i = array.length - 1; i >= 0; i--) {
//            tempArray[array.length - i - 1] = array[i];
//        }
//        return array;
//    }

    public static int[] back(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
        }
        return array;
    }
}
