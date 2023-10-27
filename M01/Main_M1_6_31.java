// CREDIT CARD VALIDATOR
// AUTHOR: <|Cody Dalton|>
// Date: 10.24.2023
// Purpose: <|To check if a credit card is valid.|>

import java.util.*;

public class Main_M1_6_31 {
    public static void main(String[] args) {
        Scanner creditCardNumber = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        long cardNum = creditCardNumber.nextLong();
        creditCardNumber.close();
    /* if number is valid or not */
        if (isValid(cardNum)) {
            System.out.println("The credit card number " + cardNum + " is valid.");
            } 
        else {
            System.out.println("The credit card number " + cardNum + " is invalid.");
            }
    }

    /** Return true if the card number is valid */
    public static boolean isValid(long number) {
        int totalNum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
        return (totalNum % 10 == 0) && (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6));
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(long number) {
        int sumOfNum = 0;
        String cardNum = Long.toString(number);
        for (int i = cardNum.length() - 2; i >= 0; i -= 2) {
            sumOfNum += getDigit(Integer.parseInt(cardNum.charAt(i) + "") * 2);
        }
        return sumOfNum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number) {
        if (number < 9) { /**is the number less than a 2 digit number? */
            return number;
            } 
        else {
            return (number / 10) + (number % 10); /** if the number is bigger than a single digit number */
        }
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(long number) {
        int sumOfNum = 0;
        String cardNum = Long.toString(number);
        for (int i = cardNum.length() - 1; i >= 0; i -= 2) {
            sumOfNum += Integer.parseInt(cardNum.charAt(i) + "");
        }
        return sumOfNum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(long number, int d) {
        return getPrefix(number, getSize(d)) == d;
    }

    /** Return the first k number of digits from
     * number. If the number of digits in number
     * is less than k, return number. */
    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            String cardNum = Long.toString(number);
            return Long.parseLong(cardNum.substring(0, k));
        }
        return number;
    }

    /** Return the number of digits in d */
    public static int getSize(long d) {
        String cardNum = Long.toString(d);
        return cardNum.length();
    }
}
