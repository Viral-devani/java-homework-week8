package homework8;
/*
Read the numbers from the console entered by the user and print the minimum
and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum
number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */

import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public static void main(String[] args) {
        MinAndMaxInputChallenge obj = new MinAndMaxInputChallenge();
        obj.maxMin();
    }

    public void maxMin() {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while (true) {
            System.out.println("Enter number  (Enter invalid number to break the loop : ");
            if (scanner.hasNextInt()) {
                int n = scanner.nextInt();
                if (n > max) {
                    max = n;
                }
                if (n < min) {
                    min = n;
                }
            } else {
                System.out.println("Minimum Number is: " + min);
                System.out.println("Maximum Number is: " + max);
                break;

            }

        }
        scanner.close();
    }

}
