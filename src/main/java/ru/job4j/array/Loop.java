package ru.job4j.array;

public class Loop {
    public static void main(String[] args) {
        int[] task = new int[5];
        for (int i = 0; i < task.length; i++) {
            task[i] = i * 2 + 3;
        }
        for (int i = 0; i < task.length; i++) {
            System.out.println(task[i]);
        }
    }
}
