package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenN5ThenFactorial120() {
        int n = 5;
        int result = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenN0ThenFactorial0() {
        int n = 0;
        int result = Factorial.calc(n);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }
}