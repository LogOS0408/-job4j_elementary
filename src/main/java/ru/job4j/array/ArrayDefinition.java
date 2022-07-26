package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива равен ages: " + ages.length);
        System.out.println("Размер массива равен surnames: " + surnames.length);
        System.out.println("Размер массива равен prices: " + prices.length);
        String[] names = new String[4];
        names[0] = "Stanislav Batuev";
        names[1] = "Ivan Batuev";
        names[2] = "Nataliya Batueva";
        names[3] = "Dasha Yamshikova";
        System.out.println("Имя под индексом 0 - " + names[0]);
        System.out.println("Имя под индексом 1 - " + names[1]);
        System.out.println("Имя под индексом 2 - " + names[2]);
        System.out.println("Имя под индексом 3 - " + names[3]);

    }
}
