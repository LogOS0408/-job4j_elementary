package ru.job4j.condition;
public class AttackRook {
    public static void main(String[] args) {
               System.out.println(check("A8", "A9"));
    }

    public static boolean check(String left, String right) {
        char a = left.charAt(0);
        char b = left.charAt(1);
        char c = right.charAt(0);
        char d = right.charAt(1);
        if (a == c) {
            return true;
        } else if (b == d) {
            return true;
        }
        return false;
    }
}