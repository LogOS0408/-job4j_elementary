package ru.job4j.loop;
public class SectionCount {
    public static int count(int length, int section) {
        int sum = 0;
        while (section <= length) {
            section = section + section;
            sum++;
        }
        return sum;
    }
}