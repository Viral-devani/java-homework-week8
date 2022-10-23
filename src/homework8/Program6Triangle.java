package homework8;

import java.util.Scanner;
/*
Write a program in Java to display the pattern like a triangle with a number.
For eg.
Input number of rows: 10
Expected Output:
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910
 */
public class Program6Triangle {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter numbers of rows : ");
        int n = s1.nextInt();

        Program6Triangle obj = new Program6Triangle();
        obj.triangle(n);
        s1.close();

    }

    public void triangle(int n) {
        int i, j;

        for (i = 1; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j);

            }
            System.out.println(" ");
        }
    }
}






