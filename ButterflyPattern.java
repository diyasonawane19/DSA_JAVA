import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows :");
        int rows = sc.nextInt();

        // upper half
        for(int i=1;i<=rows;i++){
            //1st part
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(rows -i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half

        for(int i=rows;i>=1;i--){
            //1st part
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2*(rows -i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
