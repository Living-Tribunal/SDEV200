// The Main class that launches the app
public class Main {
    public static void main(String[] args) {
        // Create an instance of the CalculatorGUI class
        CalculatorGUI gui = new CalculatorGUI();
        // Set the title of the window
        gui.setTitle("Simple Calculator");
        // Set the size of the window
        gui.setSize(300, 300);
        // Set the window to be visible
        gui.setVisible(true);
        // Set the window to close when the user clicks the X button
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}