package ru.job4j.array;

public class AlgoArray {

    public static void main(String[] args) {
        boolean isSorted = false;
        int[] array = new int[] {5, 3, 2, 1, 4};

        while (!isSorted) {
            isSorted = true;
            for (int index = 0; index < array.length; index++) {
                if (array[index] > array[index + 1]) {
                    isSorted = false;

                    int temp = array[index]; /* переменна€ дл€ временного хранени€ значение €чейки с индексом 0. */
                    array[index] = array[index + 1]; /* записываем в €чейку с индексом 0 значение €чейки с индексом 3. */
                    array[index + 1] = temp; /* записываем в €чейку с индексом 3 значение временной переменной. */
                }
            }
        }

        for (int i : array) {
            System.out.println(i);
        }
    }
}
