package ru.job4j.array;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class FindLoopsTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 3, 6};
        int el = 5;
        int result = FindLoops.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = {5, 1, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoops.indexInRange(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas4Then4() {
        int[] data = {5, 2, 10, 2, 4};
        int el = 4;
        int start = 2;
        int finish = 4;
        int result = FindLoops.indexInRange(data, el, start, finish);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNo15ThenMinus1() {
        int[] data = {5, 2, 10, 2, 4, 23, 45, 56, 12, 34};
        int el = 15;
        int start = 3;
        int finish = 6;
        int result = FindLoops.indexInRange(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}