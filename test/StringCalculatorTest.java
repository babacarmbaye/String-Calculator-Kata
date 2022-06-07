import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Before
    public void inititalize() {
        stringCalculator = new StringCalculator();
    }

    @Test
    public void stringCalculatorWithOneNumber() {
        assertEquals(stringCalculator.add(""), 0);
        assertEquals(stringCalculator.add("1"), 1);
        assertEquals(stringCalculator.add("7"), 7);
    }
}