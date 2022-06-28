package ru.job4j.akustika;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class PressureTest {

    @Test
    public void wenA16Then4() {
        double in = 16;
        double expected = 4;
        double out = Pressure.pressureOne(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void wenA16Then2() {
        double in = 16;
        double expected = 8;
        double out = Pressure.pressureTwo(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}