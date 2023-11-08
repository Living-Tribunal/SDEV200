// The CalculatorLogic class that performs the calculations
public class CalculatorLogic {
    // Declare the fields of the class
    private double firstOperand; // The first operand
    private double secondOperand; // The second operand
    private double result; // The result

    // The constructor of the class
    public CalculatorLogic() {
        // Initialize the fields to zero
        firstOperand = 0;
        secondOperand = 0;
        result = 0;
    }

    // The method that performs the calculation based on the user input and the selected operation
    public double calculate(double firstOperand, double secondOperand, String operation) {
        // Store the parameters as the fields
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
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
}