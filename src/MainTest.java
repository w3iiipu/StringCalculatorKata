import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {

    private Main calculator;

    @Before     // Before annotation makes this method execute before each test in the class
    public void init(){
        calculator = new Main(); //creates the calculator object for test
    }

    @Test // Test 1
    public void emptyStringReturnsZero() {
        assertEquals(calculator.stringCalculator(""), 0);
    }

    @Test //Test 2
    public void singleValue() {
        assertEquals(calculator.stringCalculator("1"),1);
    }

    @Test //Test 3
    public void twoNumbersCommaDelimitedReturnSum() {
        assertEquals(calculator.stringCalculator("1,2"),3);
    }



}