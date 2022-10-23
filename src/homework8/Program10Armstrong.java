package homework8;
/*
Write a program to input any number and check if it Armstrong number or not
153 = (1*1*1)+(5*5*5)+(3*3*3)
where:
(1*1*1)=1
(5*5*5)=125
(3*3*3)=27
So:
1+125+27=153
 */
import java.util.Scanner;

public class Program10Armstrong {


    public static void main(String[] args) {
        Program10Armstrong obj = new Program10Armstrong();
        obj.armstrong();


    }

    public void armstrong() {
        int number, temp, total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 digit number :");
        int n1 = scanner.nextInt();

        number = n1;
        for (; number != 0; number /= 10) {
            temp = number % 10;
            total = total + temp * temp * temp;
        }
        if (total == n1)
            System.out.println(n1 + " is an Armstrong number ");
        else
            System.out.println(n1 + " is not an Armstrong number");
   scanner.close();
    }

}
