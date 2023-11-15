

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Stack;

/**
 * 20.11 (Match grouping symbols) A Java program contains various pairs of grouping
 * symbols, such as:
 * ■ Parentheses: ( and )
 * ■ Braces: { and }
 * ■ Brackets: [ and ]
 * Note that the grouping symbols cannot overlap. For example, (a{b)} is illegal.
 * Write a program to check whether a Java source-code file has correct pairs of
 * grouping symbols. Pass the source-code file name as a command-line argument.
 */
public class GroupingSymbolChecker {

    private static final String SYMBOLS = "(){}[]";

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Exercise20_11 correct.txt");
            System.exit(1);
        }
        try {
            Stack<Character> symbols = populateStack(args[0]);
            boolean correctPairs = checkSymbols(symbols);
            StringBuilder result = new StringBuilder();
            if (correctPairs) {
                result.append("correct number of pairs");
            } else {
                result.append("INCORRECT number of pairs");
            }
            System.out.println("The source-file: " + new File(args[0]).getName() + " has " + result);
        } catch (IOException ioException) {
            System.out.println("Error reading the file: " + ioException.getMessage());
        }
    }

    private static boolean checkSymbols(Stack<Character> stack) {
        Stack<Character> holder = new Stack<>();
        int size = stack.size();
        if (size == 0) return true;
        if (size == 1) return false;
        if (size % 2 != 0) return false; // Must be even for all symbols to have a pair

        while (stack.size() > 0) {
            if (holder.size() > 0) {
                if (isPair(holder.peek(), stack.peek())) {
                    holder.pop();
                    stack.pop();
                } else if (holder.size() < 3) {
                    holder.push(stack.pop());
                } else {
                    return false;
                }
            } else {
                Character symbol = stack.pop();
                if (isPair(symbol, stack.peek())) {
                    stack.pop();
                } else {
                    holder.push(symbol);
                }
            }
        }
        return holder.size() == 0;
    }

    private static Stack<Character> populateStack(String filePath) throws IOException {
        Stack<Character> symbolsStack = new Stack<>();
        Path path = Paths.get(filePath);
        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                for (char character : line.toCharArray()) {
                    if (SYMBOLS.contains(String.valueOf(character))) {
                        symbolsStack.push(character);
                    }
                }
            }
        } catch (IOException ioException) {
            System.out.println("Error reading the file: " + ioException.getMessage());
        }
        return symbolsStack;
    }

    private static boolean isPair(char ch1, char ch2) {
        switch (ch1) {
            case '}':
                return ch2 == '{';
            case ')':
                return ch2 == '(';
            case ']':
                return ch2 == '[';
        }
        return false;
    }
}
