package Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSortAlgorithm {
    public static void main(String[] args) {
        int[] arr = {3,5,2,1,4};
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else {
                i++;
            }
        }

    }
    static void swap(int[] arr, int i,int correctIndex){
        int temp = arr[i];
        arr[i]=arr[correctIndex];
        arr[correctIndex]=temp;
    }
}

