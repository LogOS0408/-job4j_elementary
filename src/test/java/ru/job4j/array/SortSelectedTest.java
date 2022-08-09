package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when5Elements() {
        int[] data = {12, 999, 7, 2, 6};
        int[] result = SortSelected.sort(data);
        int[] expected = {2, 6, 7, 12, 999};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when3Elements() {
        int[] data = {88, 58, 88};
        int[] result = SortSelected.sort(data);
        int[] expected = {58, 88, 88};
        assertThat(result).containsExactly(expected);
    }
}