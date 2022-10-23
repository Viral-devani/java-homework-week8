package homework8;/*
Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*
 */


import java.util.Scanner;

public class Program14Diamond {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter maximum number :");
        int n = scanner.nextInt();
        diamond(n);
        scanner.close();
    }

    public static void diamond(int n) {
        //This is to print upper triangle
        int i = 1;
        while (i <= n) {
            int j = 1;//variable for spacing

            while (j++ <= n - i) {
                System.out.print(" ");
            }
            int h = 1;//variable for printing star
            while (h++ <= i * 2 - 1) {
                System.out.print("*");

            }
            System.out.println("");
            i++;
        }
        //This is to print lower Triangle
        i = n - 1;
        while (i > 0) {
            int j = 1;
            while (j++ <= n - i) {
                System.out.print(" ");
            }
            int h = 1;
            while (h++ <= i * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }


    }
}
