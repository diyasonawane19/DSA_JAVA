import java.util.*;

public class NQueen {

    static int[] x = new int[20];
    static int count = 0;

    static void NQueen(int r, int n) {
        for (int c = 1; c <= n; c++) {
            if (place(r, c)) {
                x[r] = c;
                if (r == n) {
                    print(n);
                } else {
                    NQueen(r + 1, n);
                }
            }
        }
    }

    static boolean place(int r, int c) {
        for (int j = 1; j < r; j++) {
            if (x[j] == c || Math.abs(x[j] - c) == Math.abs(j - r)) {
                return false;
            }
        }
        return true;
    }

    static void print(int n) {
        System.out.println("\n\nSolution " + (++count) + ": ");
        
        for (int i = 1; i <= n; i++) {
            System.out.print("\t" + x[i]);
        }

        for (int i = 1; i <= n; i++) {
            System.out.println();
            for (int j = 1; j <= n; j++) {
                if (x[i] == j)
                    System.out.print(" Q ");
                else
                    System.out.print(" - ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of queens: ");
        int n = sc.nextInt();

        if (n > 20) {
            System.out.println("Max limit is 20");
            return;
        }

        NQueen(1, n);
        System.out.println("\nTotal number of solutions: " + count);
    }
}
