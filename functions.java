import java.util.Scanner;

public class functions {

    public static void printMyName(String name){
        System.out.println(name);
        return;

    }

    public static void claculateSum(int a,int b){
        int sum = a+b;
        System.out.println("The sum is: " + sum);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       System.out.println("Your name is: " + name);
       
        int a = sc.nextInt();
        int b = sc.nextInt();
        claculateSum(a, b);


       
    }
    
}
