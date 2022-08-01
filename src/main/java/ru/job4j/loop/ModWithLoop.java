package ru.job4j.loop;

public class ModWithLoop {
    public static int mod(int n, int d) {
        int div = n / d;
        div = div * d;
        div = n - div;
        return div;
    }

    public static int mod2(int n, int d) {
        while (n >= d) {
            n = n - d;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(mod2(7, 8));
    }
}
