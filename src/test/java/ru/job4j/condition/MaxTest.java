package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void wenFirst5Second3Then5() {
        int first = 7;
        int second = 6;
        int result = Max.comparisonOne(first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

}