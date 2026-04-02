import java.util.Scanner;

public class PalindromicPattern {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows :"); 
        int rows = sc.nextInt();
        
        for(int i=1;i<=rows;i++){
            //spaces
            for(int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }

            //1st half numbers
            for(int j=i;j>=1;j--){
                System.out.print(j + " ");
            }

            //2nd half numbers
            for(int j=2; j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();

        }
        sc.close();
    }
}
