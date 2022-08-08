package ru.job4j.array;

public class FindLoops {
    public static int indexOf(int[] data, int el) {
        int rls = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rls = i;
                break;
            }
        }
        return rls;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int rls = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == el) {
                rls = i;
                break;
            }
        }
        return rls;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 10, 5, 4};
        int el = 5;
        int start = 1;
        int finish = 4;
        System.out.println(indexInRange(arr, el, start, finish));
    }
}

