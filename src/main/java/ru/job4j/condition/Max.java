package ru.job4j.condition;

public class Max {
    public static int comparisonOne(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        int temp = comparisonOne(first, comparisonOne(second, third));
        return temp;
    }

    public static int max(int first, int second, int third, int fourth) {
        int temp = comparisonOne(first, comparisonOne(second, comparisonOne(third, fourth)));
        return temp;
    }

    public static void main(String[] args) {
        int result = max(7, 7, 7);
        System.out.println(result);
        int res = max(7, 6, 8, 12);
        System.out.println(res);
    }
}