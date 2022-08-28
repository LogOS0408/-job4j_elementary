package ru.job4j.array;
public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] arrays = {
                {10},
                {11, 24},
                {771, 25, 3},
                {145, 27, 37, 45}
        };
        for (int[] array : arrays) {
            System.out.println("Размер вложенного массива равен: " + array.length);
        }
    }
}