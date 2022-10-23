package homework8;
/*Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)*/

public class Program9Fibonacci {

    public static void main(String[] args) {
        Program9Fibonacci obj = new Program9Fibonacci();
        obj.fibona();
    }

    public void fibona() {
        int count = 12, num1 = 0, num2 = 1;
        System.out.println("Fibonacci series of " + count + "  Numbers :");
        for (int i = 1; i <= count; ++i) {
            System.out.println(num1 + "");
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }
    }
}
