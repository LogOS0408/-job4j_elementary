package condition;
import org.junit.Test;
import org.junit.Assert;
import ru.job4j.condition.Triangle;

public class TriangleTest {
    @Test
    public void whenExist() {
        int ab = 2;
        int ac = 2;
        int bc = 2;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenNotExist() {
        int ab = 2;
        int ac = 2;
        int bc = 10;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}