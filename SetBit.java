import java.util.Scanner;

public class SetBit {
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and position: ");
        int n = sc.nextInt();   
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        int newNumber = bitMask | n;
        System.out.println("The new number is: "+newNumber);

        sc.close();
    }
}
