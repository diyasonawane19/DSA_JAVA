import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number, position and new bit value: ");
        int n = sc.nextInt();   
        int pos = sc.nextInt();
        int oper = sc.nextInt();
       
         int bitMask = 1<<pos;
        if(oper == 1){
           
            int newNumber = bitMask | n;
            System.out.println("The new number is: "+newNumber);
        }
        else{
           int newBitMask = ~(bitMask);
           int newNumber = newBitMask & n;
           System.out.println("The new number is: "+newNumber);
           
        }

       
        sc.close();
    }
}
