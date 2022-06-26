package ru.job4j.akustika;

public class Pressure {
    public static double pressureOne(double a) {
        double first = a / 4;
        return first;
    }

    public static double pressureTwo(double a) {
        double second = a / 2;
        return second;
    }

    public static void main(String[] args) {
        double rez1 = Pressure.pressureOne(16);
        System.out.println("Давление на первой полке = " + rez1);
        double rez2 = Pressure.pressureTwo(16);
        System.out.println("Давление на второй полке = " + rez2);
        double rez3 = 16;
        System.out.println("Давление на третьей полке = " + rez3);
        double rez4 = 20;
        System.out.println("Давление на третьей полке = " + rez4);

    }

}

