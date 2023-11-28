<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import CalculatorLogic;

/**
 * JUnit test class for the CalculatorLogic class.
 */
public class CalculatorLogicTest {

    private CalculatorLogic calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CalculatorLogic();
    }

    @Test
    public void testAddition() {
        // Test addition operation
        double result = calculator.performCalculation(5, 3, "+");
        assertEquals(8, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        // Test subtraction operation
        double result = calculator.performCalculation(10, 4, "-");
        assertEquals(6, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        // Test multiplication operation
        double result = calculator.performCalculation(2, 3, "*");
        assertEquals(6, result, 0.001);
    }

    @Test
    public void testDivision() {
        // Test division operation
        double result = calculator.performCalculation(8, 2, "/");
        assertEquals(4, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        // Test division by zero, expecting an ArithmeticException
        assertThrows(ArithmeticException.class, () -> calculator.performCalculation(10, 0, "/"));
    }

    @Test
    public void testInvalidOperation() {
        // Test invalid operation, expecting an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> calculator.performCalculation(5, 2, "%"));
    }

    @Test
    public void testSetResult() {
        // Test setting the result manually
        calculator.setResult(15);
        assertEquals(15, calculator.performCalculation(0, 0, "+"), 0.001);
    }
}
=======
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import CalculatorLogic;

/**
 * JUnit test class for the CalculatorLogic class.
 */
public class CalculatorLogicTest {

    private CalculatorLogic calculator;

    @BeforeEach
    public void setUp() {
        calculator = new CalculatorLogic();
    }

    @Test
    public void testAddition() {
        // Test addition operation
        double result = calculator.performCalculation(5, 3, "+");
        assertEquals(8, result, 0.001);
    }

    @Test
    public void testSubtraction() {
        // Test subtraction operation
        double result = calculator.performCalculation(10, 4, "-");
        assertEquals(6, result, 0.001);
    }

    @Test
    public void testMultiplication() {
        // Test multiplication operation
        double result = calculator.performCalculation(2, 3, "*");
        assertEquals(6, result, 0.001);
    }

    @Test
    public void testDivision() {
        // Test division operation
        double result = calculator.performCalculation(8, 2, "/");
        assertEquals(4, result, 0.001);
    }

    @Test
    public void testDivisionByZero() {
        // Test division by zero, expecting an ArithmeticException
        assertThrows(ArithmeticException.class, () -> calculator.performCalculation(10, 0, "/"));
    }

    @Test
    public void testInvalidOperation() {
        // Test invalid operation, expecting an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> calculator.performCalculation(5, 2, "%"));
    }

    @Test
    public void testSetResult() {
        // Test setting the result manually
        calculator.setResult(15);
        assertEquals(15, calculator.performCalculation(0, 0, "+"), 0.001);
    }
}
>>>>>>> 3bdef0adf4104143b15ff40be0914d8ed9aeecfc
