package homework8;
/*
Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
import java.util.Scanner;

public class Program3Vowel {
    public static void main(String[] args) {
        Program3Vowel obj = new Program3Vowel();
        obj.vowel();

    }
    public void vowel() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Alphabet (a to z)");
        String alphabet = scanner.nextLine();

        if (alphabet.length() > 1) {
            System.out.println("String length is >1");
        } else {
            switch (alphabet.toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    System.out.println(alphabet + " is vowel");
                    break;
                default:
                    System.out.println(alphabet + " is consonant");
            }
        }

    }
}

