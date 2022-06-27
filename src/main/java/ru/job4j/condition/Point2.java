package ru.job4j.condition;

public class Point2 {
    public static double distance(int x1, int y1, int x2, int y2) {
        double f = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return f;
    }

    public static void main(String[] args) {
        double rez = Point2.distance(7, 94, 15, 150);
        System.out.println(rez);
    }
}
