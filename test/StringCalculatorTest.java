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

    @Test
    public void stringCalculatorWithTwoNumbersCommaDelimited() {
        assertEquals(stringCalculator.add("2,6"), 8);
        assertEquals(stringCalculator.add("13,100"), 113);
    }

    @Test
    public void stringCalculatorWithUnknownAmountOfNumbers() {
        assertEquals(stringCalculator.add("2,6,7,100"), 115);
        assertEquals(stringCalculator.add("13,100,10,5"), 128);
    }

    @Test
    public void stringCalculatorWithNewLineDelimited() {
        assertEquals(stringCalculator.add("2\n6"), 8);
        assertEquals(stringCalculator.add("13,100"), 113);
    }
}