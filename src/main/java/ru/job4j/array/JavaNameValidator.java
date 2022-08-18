package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = false;
        for (int i = 0; i < name.length(); i++) {
            int code = name.codePointAt(i);
            int firstsymbol = name.codePointAt(0);
            if ((firstsymbol >= 48 && firstsymbol <= 57) || (firstsymbol >= 65 && firstsymbol <= 90)) {
                result = false;
                break;
            } else if ((firstsymbol >= 97 && firstsymbol <= 122) || (code >= 65 && code <= 90) || code == 36 || code == 95 || (code >= 48 && code <= 57)) {
                result = true;
            } else {
                return result;
            }
        }
        return result;
    }
}