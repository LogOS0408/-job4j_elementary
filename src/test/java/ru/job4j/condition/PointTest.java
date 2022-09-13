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
    public void when130013Then18Dot38() {
        Point a = new Point(13, 0);
        Point b = new Point(0, 13);
        a.distance(b);
        double expected = 18.38;
        assertThat(a.distance(b)).isEqualTo(expected, offset(0.01));
    }

    @Test
    public void when1305and0137Then18Dot49() {
        Point a = new Point(13, 0, 5);
        Point b = new Point(0, 13, 7);
        a.distance3d(b);
        double expected = 18.49;
        assertThat(a.distance3d(b)).isEqualTo(expected, offset(0.01));
    }
}