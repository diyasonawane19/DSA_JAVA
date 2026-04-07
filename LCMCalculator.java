import java.util.*;

public class LCMCalculator {

    static int findGCD(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int findLCM(int a, int b) {
        return (a * b) / findGCD(a, b);
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int lcm = findLCM(n1, n2);

        System.out.println("LCM is : " + lcm);
    }
}
