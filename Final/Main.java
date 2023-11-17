import javax.swing.*;

// The Main class that launches the app
public class Main {
    public static void main(String[] args) {
        // Create an instance of the CalculatorGUI class
        CalculatorGUI calculatorGUI = new CalculatorGUI();

        // Set properties of the window
        calculatorGUI.setTitle("Cody's Calculator of Calculations");
        calculatorGUI.setSize(300, 300);
        calculatorGUI.setVisible(true);
        calculatorGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
