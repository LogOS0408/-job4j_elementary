package ru.job4j.array;
public class Loop {
    public static void main(String[] args) {
        int[] tasks = new int[5];
        for (int i = 0; i < tasks.length; i++) {
            tasks[i] = i * 2 + 3;
        }
        for (int task : tasks) {
            System.out.println(task);
        }
    }
}