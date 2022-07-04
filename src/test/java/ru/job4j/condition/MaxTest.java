package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void wenFirst5Second3Then5() {
        int first = 5;
        int second = 3;
        int result = Max.comparisonOne(first, second);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wenFirst6Second9Then9() {
        int first = 6;
        int second = 9;
        int result = Max.comparisonTwo(first, second);
        int expected = 9;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wenFirst6Second6Then6() {
        int first = 6;
        int second = 6;
        int result = Max.equalNumbers(first, second);
        int expected = 6;
        Assert.assertEquals(result, expected);
    }
}