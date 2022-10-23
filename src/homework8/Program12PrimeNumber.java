package homework8;

import java.util.Scanner;

/*
Write a programme to input any number and check if it is prime or not.
(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
17.... are the prime numbers.)
 */
public class Program12PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number : ");
        int n = scanner.nextInt();

        prime(n);
    }

    public static void prime(int n) {
        int count = 0;
        if (n <= 1) {
            System.out.println("The number is not prime : ");
            return;
        }

        for (int i = 1; i < n / 2; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count > 1) {
            System.out.println("Number is not Prime");

        } else {
            System.out.println("Number is Prime");
        }
    }

}
