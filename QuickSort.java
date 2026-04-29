import java.util.*;

public class QuickSort {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Quick Sort Function
    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            // Sort left part
            quickSort(arr, low, pivotIndex - 1);

            // Sort right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition Function
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];   // last element as pivot
        int i = low - 1;         // index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // place pivot in correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Quick Sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);

        sc.close();
    }
}
