package ru.job4j.array;
public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == el) {
                rst = i;
                break;
            }
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 10, 3};
        System.out.println(indexOf(num, 2));
    }
}