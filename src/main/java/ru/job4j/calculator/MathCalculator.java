package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double subtraction(double first, double second) {
        return sub(first, second);

    }

    public static double dividing(double first, double second) {
        return div(first, second);
    }

    public static double subAndDiv(double first, double second) {
        double a = div(first, second);
        double b = sub(first, second);
        double c = a + b;
        return c;
    }

    public static double subDivSumMtp(double first, double second) {
        return sub(first, second) + div(first, second) + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчётов вычитания равен: " + subtraction(20, 10));
        System.out.println("Результат расчётов деления равен: " + dividing(20, 10));
        System.out.println("Результат расчётов суммы двух операций вычитания и деления равен: " + subAndDiv(20, 10));
        System.out.println("Результат расчётов суммы четырёх операций равен: " + subDivSumMtp(20, 10));
    }
}
