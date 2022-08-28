package ru.job4j;
public class Methods {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Methods.plus(100, 500);
        Methods.plus(4, 2);
        Methods.plus(3, 5);
    }
}