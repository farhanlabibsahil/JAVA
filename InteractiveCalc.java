import java.util.Scanner;

public class interactiveCalc {

    public static void main(String[] args) {
        int num1,num2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
         num1 = sc.nextInt();

        System.out.print("Enter second number: ");
         num2 = sc.nextInt();

        add( num1,num2);
        subtract(num1,num2);
        multiply(num1,num2);
        divide(num1,num2);
        modulus(num1,num2);

        sc.close();
    }

    static void add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    static void subtract(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }

    static void multiply(int a, int b) {
        System.out.println("Multiplication: " + (a * b));
    }

    static void divide(int a, int b) {
        if (b != 0)
            System.out.println("Division: " + (a / b));
        else
            System.out.println("Division: Not possible");
    }

    static void modulus(int a, int b) {
        if (b != 0)
            System.out.println("Modulus: " + (a % b));
        else
            System.out.println("Modulus: Not possible");
    }


}
