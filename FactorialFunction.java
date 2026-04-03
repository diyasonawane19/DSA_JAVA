import java.util.Scanner;

public class FactorialFunction {

    public static int printFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return -1;
        }
        
        //loop

        int factorial = 1;
        for(int i=n ; i>=1;i--){
          factorial = factorial * i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial: ");
        int n = sc.nextInt();
        int result = printFactorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
    }
    
}
