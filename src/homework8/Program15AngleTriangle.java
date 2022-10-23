package homework8;/*
Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *
 */

public class Program15AngleTriangle {
    public static void main(String[] args) {


        Program15AngleTriangle obj = new Program15AngleTriangle();
        obj.triangle();
    }


    public void triangle() {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

