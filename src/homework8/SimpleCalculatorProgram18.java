package homework8;

/*
Write a class with the name SimpleCalculator. The class needs two fields (instance variables) with
names firstNumber and secondNumber both of type double.
Write the following methods (instance methods):
● Method named getFirstNumber without any parameters, it needs to return the value of the
firstNumber field.
● Method named getSecondNumber without any parameters, it needs to return the value of
the secondNumber field.
● Method named setFirstNumber with one parameter of type double, it needs to set the value
of the firstNumber field.
● *Method named setSecondNumber with one parameter of type double, it needs to set the
value of the secondNumber field.
● Method named getAdditionResult without any parameters, it needs to return the result of
adding the field values of firstNumber and secondNumber.
● Method named getSubtractionResult without any parameters, it needs to return the result of
subtracting the field values of the secondNumber from the firstNumber.
● Method named getMultiplicationResult without any parameters, it needs to return the result
of multiplying the field values of firstNumber and secondNumber.
● Method named getDivisionResult without any parameters, it needs to return the result of
dividing the field values of firstNumber by the secondNumber. In case the value of
secondNumber is 0 then return 0.
TEST EXAMPLE
TEST CODE: Write the bellow code into main method
SimpleCalculator calculator = new SimpleCalculator();
calculator.setFirstNumber(5.0);
calculator.setSecondNumber(4);
System.out.println("add= " + calculator.getAdditionResult());
System.out.println("subtract= " + calculator.getSubtractionResult());
calculator.setFirstNumber(5.25);
calculator.setSecondNumber(0);
System.out.println("multiply= " + calculator.getMultiplicationResult());
System.out.println("divide= " + calculator.getDivisionResult());
 */
public class SimpleCalculatorProgram18 {
    double firstNumber, secondNumber;

    public static void main(String[] args) {

        SimpleCalculatorProgram18 obj = new SimpleCalculatorProgram18();
        obj.setFirstNumber(5.0);
        obj.setSecondNumber(4);
        System.out.println("Add = " + obj.getAdditionResult());
        System.out.println("Subtraction = " + obj.getSubtractionResult());

        obj.setFirstNumber(5.25);
        obj.setSecondNumber(0);
        System.out.println("Multiplication = " + obj.getMultiplicationResult());
        System.out.println("Division = " + obj.getDivisionResult());
    }


    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double setFirstNumber(double number1) {
        firstNumber = number1;
        return firstNumber;
    }

    public double setSecondNumber(double number2) {
        secondNumber = number2;
        return secondNumber;
    }

    public double getAdditionResult() {
        double Addition;
        Addition = firstNumber + secondNumber;
        return Addition;
    }

    public double getSubtractionResult() {
        double Subtraction;
        Subtraction = firstNumber - secondNumber;
        return Subtraction;
    }

    public double getMultiplicationResult() {
        double Multiplication;
        Multiplication = firstNumber * secondNumber;
        return Multiplication;
    }

    public double getDivisionResult() {
        double Division;
        Division = firstNumber / secondNumber;
        return Division;
    }

}
