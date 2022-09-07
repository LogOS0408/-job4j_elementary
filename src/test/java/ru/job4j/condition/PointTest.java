package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    public void when0002Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        a.distance(b);
        double expected = 2.0;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when0400Then4() {
        Point a = new Point(0, 4);
        Point b = new Point(0, 0);
        a.distance(b);
        double expected = 4.0;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when130013Then18() {
        Point a = new Point(13, 0);
        Point b = new Point(0, 13);
        a.distance(b);
        double expected = 18.384776310850235;
        assertThat(a.distance(b)).isEqualTo(expected);
    }
}