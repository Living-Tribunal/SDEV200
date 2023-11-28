<<<<<<< HEAD

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorGUITest {

    @Test
    void testActionPerformed() {
        CalculatorGUI calculatorGUI = new CalculatorGUI();

        // Test digit input
        calculatorGUI.actionPerformed(createActionEvent("1"));
        assertEquals("1", calculatorGUI.textField.getText());

        // Test arithmetic operator input
        calculatorGUI.actionPerformed(createActionEvent("+"));
        assertEquals("+", calculatorGUI.textField.getText());

        // Test second digit input
        calculatorGUI.actionPerformed(createActionEvent("2"));
        assertEquals("2", calculatorGUI.textField.getText());

        // Test equals sign input
        calculatorGUI.actionPerformed(createActionEvent("="));
        assertEquals("3.0", calculatorGUI.textField.getText());

        // Test clear input
        calculatorGUI.actionPerformed(createActionEvent("C"));
        assertEquals("", calculatorGUI.textField.getText());
    }

    private ActionEvent createActionEvent(String command) {
        return new ActionEvent(this, ActionEvent.ACTION_PERFORMED, command);
    }
}
=======

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorGUITest {

    @Test
    void testActionPerformed() {
        CalculatorGUI calculatorGUI = new CalculatorGUI();

        // Test digit input
        calculatorGUI.actionPerformed(createActionEvent("1"));
        assertEquals("1", calculatorGUI.textField.getText());

        // Test arithmetic operator input
        calculatorGUI.actionPerformed(createActionEvent("+"));
        assertEquals("+", calculatorGUI.textField.getText());

        // Test second digit input
        calculatorGUI.actionPerformed(createActionEvent("2"));
        assertEquals("2", calculatorGUI.textField.getText());

        // Test equals sign input
        calculatorGUI.actionPerformed(createActionEvent("="));
        assertEquals("3.0", calculatorGUI.textField.getText());

        // Test clear input
        calculatorGUI.actionPerformed(createActionEvent("C"));
        assertEquals("", calculatorGUI.textField.getText());
    }

    private ActionEvent createActionEvent(String command) {
        return new ActionEvent(this, ActionEvent.ACTION_PERFORMED, command);
    }
}
>>>>>>> 3bdef0adf4104143b15ff40be0914d8ed9aeecfc
