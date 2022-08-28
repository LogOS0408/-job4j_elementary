package ru.job4j;
import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.SqArea;
public class SqAreaTest {
    @Test
    public void whenP6K2ThenSquare2() {
        double k = 2;
        int p = 6;
        int expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K4ThenSquare2Dot56() {
        double k = 4;
        int p = 8;
        double expected = 2.56;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K6ThenSquare3Dot06() {
        double k = 6;
        int p = 10;
        double expected = 3.06;
        double out = SqArea.square(10, 6);
        Assert.assertEquals(expected, out, 0.01);
    }
}