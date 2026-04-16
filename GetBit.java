import java.util.*;

public class GetBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and position: ");
        int n = sc.nextInt();
        int pos = sc.nextInt();
        int bitMask = 1<<pos;

        if((bitMask & n) ==0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }
    }
}
