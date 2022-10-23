package homework8;

/*
Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
 */
public class Program11EvenDigitSum {


    public static void main(String[] args) {
        getEvenDigitSum(123456789);
        getEvenDigitSum(252);
        getEvenDigitSum(-22);
    }

    public static void getEvenDigitSum(int number) {
        int sum = 0, digit;
        int originalnumber = number;

        if (number < 0) {
            System.out.println("Invalid number return -1 ");

        } else {
            while (number != 0) {
                digit = number % 10;
                if (digit % 2 == 0)
                    sum = sum + digit;
                number = number / 10;
            }
            System.out.println("Sum of even digit number  " + originalnumber + " is " + sum);
        }

    }
}
