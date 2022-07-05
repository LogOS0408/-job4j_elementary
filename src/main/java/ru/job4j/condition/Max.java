package ru.job4j.condition;

public class Max {
    public static int comparisonOne(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.comparisonOne(7, 6);
        System.out.println(result);

    }

}