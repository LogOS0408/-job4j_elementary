package ru.job4j.loop;
public class MultiplicationLoop {
    public static int mult(int a, int b) {
        int mtp = 1;
        for (int i = a; i <= b; i++) {
            mtp = mtp * i;
            System.out.println(mtp);
        }
        return mtp;
    }
}