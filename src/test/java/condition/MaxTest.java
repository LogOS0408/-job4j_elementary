package condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Max;

public class MaxTest {
    @Test
    public void wenFirst7Second3Then7() {
        int first = 7;
        int second = 3;
        int result = Max.max(first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wenFirst3Second7Then7() {
        int first = 3;
        int second = 7;
        int result = Max.max(first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wenFirst7Second7Then7() {
        int first = 7;
        int second = 7;
        int result = Max.max(first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wenFirst4Second6Third7Then7() {
        int first = 4;
        int second = 6;
        int third = 7;
        int result = Max.max(first, second, third);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wenFirst4Second6Third7Fourth8Then8() {
        int first = 4;
        int second = 6;
        int third = 7;
        int fourth = 8;
        int result = Max.max(first, second, third, fourth);
        int expected = 8;
        Assert.assertEquals(result, expected);
    }
}