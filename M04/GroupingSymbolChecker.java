import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class GroupingSymbolChecker {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java GroupingSymbolChecker Main_M1_6_9.java");
            System.exit(1);
        }

        String fileName = args[0];

        try {
            if (checkGroupingSymbols(fileName)) {
                System.out.println("Correct grouping symbols in the file.");
            } else {
                System.out.println("Incorrect grouping symbols in the file.");
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    private static boolean checkGroupingSymbols(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        Stack<Character> stack = new Stack<>();

        int lineNumber = 1;
        int charPosition = 0;
        String line;

        while ((line = reader.readLine()) != null) {
            lineNumber++;

            for (char c : line.toCharArray()) {
                charPosition++;

                if (isOpeningSymbol(c)) {
                    stack.push(c);
                } else if (isClosingSymbol(c)) {
                    if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                        System.out.println("Error: Mismatched grouping symbols at line "
                                + lineNumber + ", position " + charPosition);
                        return false;
                    }
                }
            }

            charPosition = 0; // Reset character position for the next line
        }

        if (!stack.isEmpty()) {
            System.out.println("Error: Unclosed grouping symbols.");
            return false;
        }

        reader.close();
        return true;
    }

    private static boolean isOpeningSymbol(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static boolean isClosingSymbol(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
               (opening == '{' && closing == '}') ||
               (opening == '[' && closing == ']');
    }
}
