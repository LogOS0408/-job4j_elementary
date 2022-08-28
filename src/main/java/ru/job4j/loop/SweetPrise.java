package ru.job4j.loop;
public class SweetPrise {
    public static void out(int price) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = price * i;
            System.out.println(sum);
        }
    }
}