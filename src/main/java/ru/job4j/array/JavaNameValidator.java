package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        if (name.isEmpty()) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            int ch = name.codePointAt(i);
            boolean statement = (i > 0 && Character.isDigit(ch));
            boolean statement0 = isSpecialSymbol(ch);
            boolean statement1 = (i > 0 && isLowerLatinLetter(ch));
            boolean statement2 = (i > 0 && isUpperLatinLetter(ch));
            boolean statement3 = (i == 0 && isLowerLatinLetter(ch));

            boolean resStat = !statement && !statement0
                    && !statement1 && !statement2 && !statement3;
            if (resStat) {
                return false;
            }

        }
        return true;
    }

    //метод должен вернуть true, если символ является символом доллара и нижнее подчеркивание
    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

}