// IDENTICAL ARRAYS
// AUTHOR: <|Cody Dalton|>
// Date: 10.24.2023
// Purpose: <|To check if two arrays or identical or not.|>

import java.util.Scanner;

public class Main_M1_8_29 {
    public static void main(String[] args) {
        Scanner arrayNums = new Scanner(System.in);
        /* creating a 3x3 array and asking for a 9 number string for input */
        int[][] firstArray = new int[3][3];
        System.out.print("Enter the first set of 9 numbers: ");
        /* for loops iterating through num and adding it to an array */
        for (int numOne = 0; numOne < firstArray.length; numOne++) {
            for (int numTwo = 0; numTwo < firstArray.length; numTwo++) {
                firstArray[numOne][numTwo] = arrayNums.nextInt();
            }
        }
        /* same as above, just with the second string of numbers */
        int[][] secondArray = new int[3][3];
        System.out.print("Enter the second set of 9 numbers: ");
        for (int numOne = 0; numOne < secondArray.length; numOne++) {
            for (int numTwo = 0; numTwo < secondArray.length; numTwo++) {
                secondArray[numOne][numTwo] = arrayNums.nextInt();
            }
        }
        arrayNums.close();
        /* telling user the strings are equal or not */
        if (equals(secondArray, firstArray)) {
            System.out.println("The Arrays are identical.");
        } 
            else {
            System.out.println("The Arrays are not identical.");
        }
    }

    public static boolean equals(int[][] arrayOne, int[][] arrayTwo) {
        /*If the value of an element in arrayOne is not equal to the corresponding element in arrayTwo, 
        then the function returns false. Otherwise, it continues to compare the next pair of elements. */
        for (int numOne = 0; numOne < arrayOne.length; numOne++) {
            for (int numTwo = 0; numTwo < arrayTwo.length; numTwo++) {
                if (arrayOne[numOne][numTwo] != arrayTwo[numOne][numTwo]) {
                    return false;
                }
            }
        }
        return true;
    }
}
