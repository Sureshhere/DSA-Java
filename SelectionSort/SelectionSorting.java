import java.util.Arrays;

public class SelectionSorting {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            // Assume the current index is the maximum
            int maxIndex = i;


            // Find the index of the maximum element in the unsorted part of the array
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap the found maximum element with the last element in the unsorted part
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Perform selection sort with maximum element in ascending order
        selectionSort(arr);

        System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));
    }
}
