import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The CalculatorGUI class that represents a simple calculator GUI.
 */
public class CalculatorGUI extends JFrame implements ActionListener {
    // Declare the fields of the class
    private final JTextField textField; // The text field that displays the user input and output
    private final JPanel panel; // The panel that contains the buttons
    private final JButton[] buttons; // The array that stores the buttons
    private String input; // The user input
    private String operation; // The selected operation
    private double firstOperand; // The first operand
    private double secondOperand; // The second operand
    private double result; // The result
    private final CalculatorLogic logic; // The CalculatorLogic object that performs the calculations

    /**
     * Constructs a CalculatorGUI object.
     */
    public CalculatorGUI() {
        // Initialize the fields
        textField = new JTextField(20);
        panel = new JPanel();
        buttons = new JButton[16];
        input = "";
        operation = "";
        firstOperand = 0;
        secondOperand = 0;
        result = 0;
        logic = new CalculatorLogic();

        // Set the layout of the panel to a 4x4 grid
        panel.setLayout(new GridLayout(4, 4));

        // Create the buttons and add them to the panel
        String[] buttonLabels = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setBackground(Color.DARK_GRAY);// Set button background color directly
            buttons[i].setForeground(Color.WHITE);// Set button text color directly
            buttons[i].setFont(new Font("Tragen pro", Font.PLAIN, 26));
            panel.add(buttons[i]);
            // Add the action listener to each button
            buttons[i].addActionListener(this);

        }

        textField.setForeground(Color.WHITE); // Set text color

        // Set background color for the panel
        panel.setBackground(Color.WHITE);

        // Customize the appearance of the text field
        textField.setBackground(Color.DARK_GRAY);
        textField.setFont(new Font("Tragen Pro", Font.BOLD, 50));
        textField.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        // Add the text field and the panel to the frame
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    /**
     * Handles the user input and output based on button clicks.
     */
    public void actionPerformed(ActionEvent e) {
        // Get the command from the source of the event
        String command = e.getActionCommand();

        // If the command is a digit or a decimal point, append it to the input
        if (Character.isDigit(command.charAt(0)) || command.equals(".")) {
            input += command;
            // Display the input on the text field
            textField.setText(input);
        }
        // If the command is an arithmetic operator, store the input as the first operand and the command as the operation
        else if (isArithmeticOperator(command)) {
            // Parse the input as a double
            firstOperand = Double.parseDouble(input);
            // Store the command as the operation
            operation = command;
            // Clear the input
            input = "";
            // Display the operation on the text field
            textField.setText(operation);
        }
        // If the command is the equal sign, store the input as the second operand and perform the calculation
        else if (command.equals("=")) {
            // Parse the input as a double
            secondOperand = Double.parseDouble(input);
            // Perform the calculation using the CalculatorLogic object
            result = logic.performCalculation(firstOperand, secondOperand, operation);
            // Display the result on the text field
            textField.setText(String.valueOf(result));
            // Clear the input and the operation
            input = "";
            operation = "";
        }
    }

    /**
     * Checks if the given command is an arithmetic operator.
     *
     * @param command The command to check.
     * @return True if the command is an arithmetic operator, false otherwise.
     */
    private boolean isArithmeticOperator(String command) {
        return command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/");
    }
}
