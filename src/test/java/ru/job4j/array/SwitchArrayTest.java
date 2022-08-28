package ru.job4j.array;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class SwitchArrayTest {
    @Test
    public void whenSwap0To3() {
        int[] input = new int[]{1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[]{4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2To3() {
        int[] input = new int[]{50, 3, 151, 32, 40, 90};
        int source = 2;
        int dest = 3;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[]{50, 3, 32, 151, 40, 90};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap1To4() {
        int[] input = new int[]{50, 3, 151, 32, 40, 90};
        int source = 1;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = new int[]{50, 40, 151, 32, 3, 90};
        assertThat(result).containsExactly(expected);
    }
}