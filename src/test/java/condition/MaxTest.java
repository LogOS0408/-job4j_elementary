package condition;
import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Max;

public class MaxTest {
    @Test
    public void wenFirst7Second3Then7() {
        int first = 7;
        int second = 3;
        int result = Max.comparisonOne(first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wenFirst3Second7Then7() {
        int first = 3;
        int second = 7;
        int result = Max.comparisonOne(first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void wenFirst7Second7Then7() {
        int first = 7;
        int second = 7;
        int result = Max.comparisonOne(first, second);
        int expected = 7;
        Assert.assertEquals(result, expected);
    }
}