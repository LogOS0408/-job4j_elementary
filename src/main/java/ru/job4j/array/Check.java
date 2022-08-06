package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[0] != data[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean[] data = new boolean[]{false, true, false};
        System.out.println(mono(data));
    }

}
