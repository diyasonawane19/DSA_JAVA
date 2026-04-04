import java.util.Scanner;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = sc.nextInt();

        System.out.println("Enter second number:");
        int num2 = sc.nextInt();

        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Result: " + add(num1, num2));
                break;

            case '-':
                System.out.println("Result: " + subtract(num1, num2));
                break;

            case '*':
                System.out.println("Result: " + multiply(num1, num2));
                break;

            case '/':
                System.out.println("Result: " + divide(num1, num2));
                break;

            default:
                System.out.println("Invalid operation");
        }

        sc.close();
    }
}
