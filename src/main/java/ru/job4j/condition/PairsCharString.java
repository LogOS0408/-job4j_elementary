package ru.job4j.condition;

public class PairsCharString {
    public static void main(String[] args) {
        System.out.println(check("s", "s"));
    }

    public static boolean check(String l, String r) {
        if (l.isEmpty() || r.isEmpty()) {
            return true;
        }
        int first = l.length() - 1;
        char lastOne = l.charAt(first);
        int second = r.length() - 1;
        char lastTwo = r.charAt(second);
        char a = l.charAt(0);
        char b = r.charAt(0);
        if (a == lastTwo && lastOne == b) {
            return true;
        }
        return false;
    }
}
