package homework8;
/*
Palindrome Number
Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
Example Input/Output
isPalindrome(-1221); → should return true
isPalindrome(707); → should return true
isPalindrome(11212); → should return false because the reverse is 21211 and that is not equal to
11212.
Tip: What is a Palindrome number? A palindrome number is a number which when reversed is equal
to the original number. For example: 121, 12321, and 1001 etc.
Tip: Logic to check a palindrome number
Find the reverse of the given number. Store it in some variable, say reverse. Compare the number
with the reverse.
If both are the same then the number is a palindrome otherwise it is not.
 */

import java.util.Scanner;

public class Program5Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is Palindrome:");
        int number = scanner.nextInt();
        boolean value;

        value = ispalindrome(number);

        if (value) {
            System.out.println("Number " + number + " is Palindrome");
        } else {
            System.out.println("Number " + number + " is NOT Palindrome");
        }
    }

    public static boolean ispalindrome(int num) {
        boolean value1;
        int reverse = 0;
        int temp = num; //storing orignial number to temp variable
        // reversing number and storing in varilable called reverse
        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        // comparing original & reversed number
        if (num == reverse) {
            value1 = true;
        } else {
            value1 = false;
        }
        return value1;

    }
}
