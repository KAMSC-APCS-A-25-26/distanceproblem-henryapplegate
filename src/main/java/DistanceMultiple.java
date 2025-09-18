/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */

// Rerun

import java.util.Scanner;

public class DistanceMultiple {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Prompt for number of runs
        System.out.print("How many times do you want to run the program?  ");
        int runs = sc.nextInt();
        System.out.println();

        for(int i = 1; i <= runs; i++) {
            // Prompt for 3 numbers
            System.out.print("Enter number 1:  ");
            double num1 = sc.nextDouble();
            System.out.print("Enter number 2:  ");
            double num2 = sc.nextDouble();
            System.out.print("Enter number 3:  ");
            double num3 = sc.nextDouble();

            // Find the average of the numbers
            System.out.println();
            double avg = (num1 + num2 + num3) / 3;
            System.out.println("The average is " + avg);

            // Find the sum of the numbers
            double sum = num1 + num2 + num3;
            System.out.println("The sum is " + sum);

            // Find the product of the numbers
            double product = num1 * num2 * num3;
            System.out.println("The product is " + product);
            System.out.println();
        }
    }
}