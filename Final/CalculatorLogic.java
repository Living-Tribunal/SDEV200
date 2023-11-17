/**
 * The CalculatorLogic class that performs arithmetic calculations.
 */
public class CalculatorLogic {

    /**
     * The result of the calculation.
     */
    private double result;

    /**
     * Constructs a CalculatorLogic object with initial values set to zero.
     */
    public CalculatorLogic() {
        this.result = 0;
    }

    /**
     * Performs a calculation based on the given operands and operation.
     *
     * @param firstOperand  The first operand.
     * @param secondOperand The second operand.
     * @param operation     The arithmetic operation (+, -, *, /).
     * @return The result of the calculation.
     * @throws ArithmeticException    If attempting to divide by zero.
     * @throws IllegalArgumentException If an invalid operation is provided.
     */
    public double performCalculation(double firstOperand, double secondOperand, String operation) {
        // Perform the calculation based on the operation
        switch (operation) {
            case "+":
                result = firstOperand + secondOperand;
                break;
            case "-":
                result = firstOperand - secondOperand;
                break;
            case "*":
                result = firstOperand * secondOperand;
                break;
            case "/":
                // Check if the second operand is zero
                if (secondOperand == 0) {
                    // Throw an exception
                    throw new ArithmeticException("Cannot divide by zero");
                }
                result = firstOperand / secondOperand;
                break;
            default:
                // Throw an exception
                throw new IllegalArgumentException("Invalid operation");
        }

        // Return the result
        return result;
    }

    /**
     * Set the result.
     *
     * @param result The value to set as the result.
     */
    public void setResult(double result) {
        this.result = result;
    }
}
