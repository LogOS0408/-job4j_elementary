package ru.job4j;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when0020Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when3588Then5dot83() {
        int x1 = 3;
        int y1 = 5;
        int x2 = 8;
        int y2 = 8;
        double expected = 5.83;
        double out = Point.distance(3, 5, 8, 8);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when49910Then5dot09() {
        int x1 = 4;
        int y1 = 9;
        int x2 = 9;
        int y2 = 10;
        double expected = 5.09;
        double out = Point.distance(4, 9, 9, 10);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when69415150Then56dot71() {
        int x1 = 6;
        int y1 = 94;
        int x2 = 15;
        int y2 = 150;
        double expected = 56.71;
        double out = Point.distance(6, 94, 15, 150);
        Assert.assertEquals(expected, out, 0.01);
    }

}