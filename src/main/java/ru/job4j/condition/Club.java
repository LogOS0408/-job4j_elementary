package ru.job4j.condition;
public class Club {
    public static void permission(boolean hasMoney, boolean beFriend) {
        if (hasMoney || beFriend) {
            System.out.println("I can go to the computer club !");
        } else {
            System.out.println("I can't go to the computer club.");
        }
    }

    public static void main(String[] args) {
        Club.permission(true, true);
        Club.permission(true, false);
        Club.permission(false, false);
        Club.permission(false, true);
    }
}