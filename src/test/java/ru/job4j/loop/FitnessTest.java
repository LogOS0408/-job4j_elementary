package ru.job4j.loop;
import org.junit.Test;
import org.junit.Assert;
public class FitnessTest {
    @Test
    public void whenIvan95ThenNik90() {
        int ivan = 95;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvan90ThenNik95() {
        int ivan = 90;
        int nik = 95;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvan50ThenNik90() {
        int ivan = 50;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvan90ThenNik90() {
        int ivan = 90;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}