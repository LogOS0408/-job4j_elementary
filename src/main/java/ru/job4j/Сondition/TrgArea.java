package ru.job4j.Сondition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double i = p * (p - a) * (p - b) * (p - c);
        double s = Math.sqrt(i);
        return s;
    }

    public static void main(String[] args) {
        double rez = TrgArea.area(2, 2, 2);
        System.out.println("Square is " + rez);
    }
}
