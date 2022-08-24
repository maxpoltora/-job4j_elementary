package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {

        int minVal = Math.min(word.length, pref.length);
        for (int i = 0; i < minVal; i++) {
            if (word[i] != pref[i]) {
                return false;
            }
        }
        return true;
    }
}

