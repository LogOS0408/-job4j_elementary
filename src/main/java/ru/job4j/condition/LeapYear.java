package ru.job4j.condition;
public class LeapYear {
    @SuppressWarnings("checkstyle:SimplifyBooleanReturn")
    public static boolean checkYear(int year) {
        if (year % 400 == 0 && year % 100 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}