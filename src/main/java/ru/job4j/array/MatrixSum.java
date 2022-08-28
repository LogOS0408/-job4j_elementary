package ru.job4j.array;
public class MatrixSum {
    public static int sum(int[][] array) {
        int rls = 0;
        for (int[] row : array) {
            for (int cell : row) {
                rls += cell;
            }
        }
        return rls;
    }
}