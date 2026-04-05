import java.util.*;
public class CalCircumference {
   public static Double getCircumference(Double radius) {
       return 2 * 3.14 * radius;
   }
   public static void main(String args[]) {
         
      System.out.println("Enter the radius of the circle: ");

      Scanner sc = new Scanner(System.in);
      Double r = sc.nextDouble();
      System.out.println(getCircumference(r));
      sc.close();
   }   
}




