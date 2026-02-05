public class day2 {

    public static int getLargestElement(int marks[]){
       int largest = Integer.MIN_VALUE;
       
        for(int i =0; i< marks.length;i++){
             if(largest<marks[i]){
                largest=marks[i];
             }
             
        }
        return largest;
    }

    public static int getSmallestElement(int marks[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i< marks.length;i++){
             if(smallest>marks[i]){
                smallest=marks[i];
             }
             
        }  
              return smallest;
    }
 
    
    public static int binarySearch(int marks[],int key){
        int start =0 , end = marks.length - 1;
        while(start<=end){
            int mid = (start + end)/2;
            if(marks[mid]==key){
                return mid;
            }
            if(marks[mid]<key){
                start = mid +1;
                
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    // public static void reverseArray(int marks[]){
    //     int start = 0, end = marks.length-1;
    //     while(start<end){
    //         int temp =  marks[end];
    //         marks[end] = marks[start];
    //         marks[start] = temp;
    //         start++;
    //         end--;
    //     }
    // }
    
    public static void printPairs(int marks[]){
        int totalPairs=0;
        for(int i =0;i<marks.length;i++){
            for(int j=i+1;j<marks.length;j++){
                System.out.print("("+marks[i]+","+marks[j]+")");
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + totalPairs);
    }

    public static void printSubarrays(int marks[]){
        int totalSubarrays=0;
        for(int i =0;i<marks.length;i++){
            for(int j=i;j<marks.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(marks[k] + " ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + totalSubarrays);
    }

     public static void pintMaxSubarraySum(int marks[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i =0;i<marks.length;i++){
            for(int j=i;j<marks.length;j++){
                int currentSum =0;
                for(int k=i;k<=j;k++){
                    currentSum += marks[k];
                }
                System.out.println(currentSum);
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
            System.out.println();
        }
        System.out.println("The maximum subarray sum is: " + maxSum);
     }
    public static void main(String[] args) {
        int marks[] = {2,4,6,8,10};
        int key = 99;
        System.out.println("The largest element in the array is: " + getLargestElement(marks));
        System.out.println("The smallest element in the array is: " + getSmallestElement(marks));
        System.out.println("------------------Binary Search------------------");
        System.out.println("The index of the element 99 in the array is: " + binarySearch(marks, key)); 

        // System.out.println("------------------Reverse Array------------------");

        // reverseArray(marks);
        // for(int i =0 ;i< marks.length;i++){
        //     System.out.print(marks[i] + " ");
        // }

        
        System.out.println("------------------Print Pairs------------------");      
        printPairs(marks);

        System.out.println("------------------Print Subarrays------------------");
        printSubarrays(marks);

        System.out.println("------------------Maximum Subarray Sum------------------");
        pintMaxSubarraySum(marks);
    }
}
