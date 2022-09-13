package ru.job4j.condition;

public class Max {
    public static int comparisonOne(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
          return comparisonOne(first, comparisonOne(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return comparisonOne(first, max(second, third, fourth));
    }

    public static void main(String[] args) {
        int result = max(7, 7, 7);
        System.out.println(result);
        int res = max(7, 6, 8, 12);
        System.out.println(res);
    }
}