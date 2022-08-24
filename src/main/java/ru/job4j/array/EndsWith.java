package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        int minVal = Math.min(word.length, post.length);
        for (int i = 0; i < minVal; i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

}
