package ru.job4j;

public class Fit {
    public static double manWeight(short height) {
        double rls = (height - 100) * 1.15;
        return rls;
    }

    public static double womanWeight(short height) {
        double rls = (height - 110) * 1.15;
        return rls;
    }

    public static void main(String[] args) {
        short menheight = 187;
        double man = Fit.manWeight(menheight);
        System.out.println("Man 187 is " + man);
        short womanheight = 175;
        double woman = Fit.womanWeight(womanheight);
        System.out.println("Woman 175 is " + woman);

    }
}
