package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = !name.isEmpty();
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            if (isUpperLatinLetter(name.codePointAt(0))
                    || isSpecialSymbol(name.codePointAt(0))
                    || isFrom0To10(name.codePointAt(0))) {
                return false;
            } else if (isLowerLatinLetter(code)
                    || isUpperLatinLetter(code)
                    || isSpecialSymbol(code)
                    || isFrom0To10(code)) {
                return true;
            }
        }
        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isFrom0To10(int code) {
        return code >= 48 && code <= 57;
    }
}