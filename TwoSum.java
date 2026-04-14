import java.util.*;

public class TwoSum {
    public static int[] two_sum(int arr[] , int target){
       
        for(int i=0;i<arr.length;i++){
           for(int j = i+1;j<arr.length;j++){
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};
            }
           }
        }
        return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value:");
        int target = sc.nextInt();
        int ans[] = two_sum(arr, target);
        System.out.println("The indices of the two numbers that add up to the target are:");
        for(int it : ans){

            System.out.print(it + " ");
            
        }
       
    }

}
