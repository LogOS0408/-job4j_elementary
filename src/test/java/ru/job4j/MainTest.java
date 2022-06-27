package ru.job4j;

import org.junit.Test;
import ru.job4j.calculator.Fit;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainTest {
    @Test
    public void whenActionThenResult() {
        int excepted = 1;
        int result = 1;
        assertThat(result, is(excepted));
    }

    public static class FitTest {

        @Test
        public void whenMan180When92() {
            short in = 180;
            double expected = 92;
            double out = Fit.manWeight(in);
            Assert.assertEquals(expected, out, 0.01);
        }

        @Test
        public void whenWoman160Then57dot49() {
            short in = 160;
            double expected = 57.49;
            double out = Fit.womanWeight(in);
            Assert.assertEquals(expected, out, 0.01);
        }
    }
}
