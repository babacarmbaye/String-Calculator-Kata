import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.assertEquals;

public class StringCalculatorTest {

    private StringCalculator stringCalculator;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

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

    @Test
    public void negativeInputReturnsException() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("negatives not allowed !");
        stringCalculator.add("-5");
        stringCalculator.add("-6,16\n-15");
    }

    @Test
    public void numbersGreaterThan1000AreIgnored() {
        assertEquals(stringCalculator.add("13,1001"), 13);
        assertEquals(stringCalculator.add("67894,20\n4,134566"), 24);
    }
}