package homework8;/*
Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */

import java.util.Scanner;

public class Program8Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number of rows : ");
        int n = scanner.nextInt();
        Program8Triangle obj = new Program8Triangle();
        obj.triangle(n);
    }

    public void triangle(int n) {
        int i, j;
        for (i = 0; i <= n; i++)
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
}
