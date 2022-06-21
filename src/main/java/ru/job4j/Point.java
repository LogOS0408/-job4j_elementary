package ru.job4j;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = (x2 - x1);
        double b = (y2 - y1);
        double c = Math.pow(a, 2);
        double d = Math.pow(b, 2);
        double i = c + d;
        double f = Math.sqrt(i);
        return f;
    }

    public static void main(String[] args) {
        double rez = Point.distance(15, 25, 45, 80);
        System.out.println(rez);
    }
}
