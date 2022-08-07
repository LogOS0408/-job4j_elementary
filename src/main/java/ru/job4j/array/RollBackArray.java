package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int current = array[array.length - 1 - i];
            result[i] = current;
        }
        return result;
    }
}