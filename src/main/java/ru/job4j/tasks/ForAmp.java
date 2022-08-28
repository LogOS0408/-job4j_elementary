package ru.job4j.tasks;
public class ForAmp {
    public static boolean experimentone(char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 'A' || array[i] == 'B' && array[i] == 'C') {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C'};
        System.out.println(experimentone(array));
    }
}