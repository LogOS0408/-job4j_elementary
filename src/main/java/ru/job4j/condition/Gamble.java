package ru.job4j.condition;

public class Gamble {
    public static int checkGame(double percent, int prize, int pay) {
        double rls = percent * prize;
        if (rls > pay) {
          return (int) rls - pay;
        } else {
            return  0;
        }
    }
}
