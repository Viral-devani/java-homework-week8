package homework8;
/*
Digit Sum Challenge
Write a method with the name sumDigits that has one int parameter called number.
If the parameter is >= 10 then the method should process the number and return sum of all digits,
otherwise return -1 to indicate an invalid value.
The numbers from 0-9 have 1 digit so we don't want to process them; also we don't want to process
negative numbers, so also return -1 for negative numbers.
For example calling the method sumDigits(125) should return 8 since 1 + 2 + 5 = 8.
Calling the method sumDigits(1) should return -1 as per requirements described above.
Add some code to the main method to test out the sumDigits method to determine that it is working
correctly for valid and invalid values passed as arguments.
Hint: Use n % 10 to extract the least-significant digit.
Use n = n / 10 to discard the least-significant digit.
The method needs to be static
Create a class with the name DigitSumChallenge
 */



public class DigitSumChallengeProgram4 {
    public static void main(String[] args) {

        sumDigit(1234);
        sumDigit(77888);
        sumDigit(9);
    }
    public static void sumDigit(int number) {
        int sum = 0;
        int temp = number;
        int r;
        if (number >= 10) {
            while (number > 0) {
                r = number % 10;
                sum = sum + r;
                number = number / 10;
            }
            System.out.println("Sum of the digit " + temp + " is: " + sum);
        } else {
            sum = -1;
            System.out.println(+temp + " is Invalid value Return " + sum);

        }
    }
}
