import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorGUI extends JFrame implements ActionListener {
    // Declare the fields of the class
    private JTextField textField; // The text field that displays the user input and output
    private JPanel panel; // The panel that contains the buttons
    private JButton[] buttons; // The array that stores the buttons
    private String input; // The user input
    private String operation; // The selected operation
    private double firstOperand; // The first operand
    private double secondOperand; // The second operand
    private double result; // The result
    private CalculatorLogic logic; // The CalculatorLogic object that performs the calculations

    // The constructor of the class
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
        buttons[0] = new JButton("7");
        buttons[1] = new JButton("8");
        buttons[2] = new JButton("9");
        buttons[3] = new JButton("/");
        buttons[4] = new JButton("4");
        buttons[5] = new JButton("5");
        buttons[6] = new JButton("6");
        buttons[7] = new JButton("*");
        buttons[8] = new JButton("1");
        buttons[9] = new JButton("2");
        buttons[10] = new JButton("3");
        buttons[11] = new JButton("-");
        buttons[12] = new JButton("0");
        buttons[13] = new JButton(".");
        buttons[14] = new JButton("=");
        buttons[15] = new JButton("+");

        for (int i = 0; i < buttons.length; i++) {
            panel.add(buttons[i]);
            // Add the action listener to each button
            buttons[i].addActionListener(this);
        }

        // Add the text field and the panel to the frame
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
    }

    // The method that handles the user input and output
    public void actionPerformed(ActionEvent e) {
        // Get the command from the source of the event
        String command = e.getActionCommand();
        // If the command is a digit or a decimal point, append it to the input
        if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
            input += command;
            // Display the input on the text field
            textField.setText(input);
        }
        // If the command is an arithmetic operator, store the input as the first operand and the command as the operation
        else if (command.equals("+") || command.equals("-") || command.equals("*") || command.equals("/")) {
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
            result = logic.calculate(firstOperand, secondOperand, operation);
            // Display the result on the text field
            textField.setText(String.valueOf(result));
            // Clear the input and the operation
            input = "";
            operation = "";
        }
    }
}