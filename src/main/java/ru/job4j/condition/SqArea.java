package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double i = h * k;
        double s = h * i;
        return s;
    }

    public static void main(String[] args) {
        double rez = SqArea.square(6, 2);
        System.out.println("Square is " + rez);
    }
}
