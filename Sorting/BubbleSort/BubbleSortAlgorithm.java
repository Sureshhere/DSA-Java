package BubbleSort;

import java.util.Arrays;

public class BubbleSortAlgorithm {
    public static void main(String[] args) {
        int[] a = {5,4,2,1,3};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;

        for(int i=0;i<arr.length;i++){
            swapped=false;
            for (int j=1;j< arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped=true;
                }
            }
            if (!swapped){
                break;
            }
        }
    }
}
