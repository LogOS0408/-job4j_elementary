package ru.job4j.calculator;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int rls = count / n;
        rls = rls + count;
        return rls;
    }
}
