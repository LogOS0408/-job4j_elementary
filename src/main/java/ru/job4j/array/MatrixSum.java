package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rls = 0;
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                rls += array[row][cell];
            }
        }
        return rls;
    }
}