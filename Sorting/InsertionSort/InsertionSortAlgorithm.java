package Sorting.InsertionSort;

import java.util.Arrays;
public class InsertionSortAlgorithm {
    public static void main(String[] args) {

        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));

        // Perform selection sort with maximum element in ascending order
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
                else{
                    break;
                }
            }
        }
    }
}
