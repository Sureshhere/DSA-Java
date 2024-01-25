package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        System.out.println(Arrays.toString(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] array, int x , int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
    static void reverseArray(int[] array){
        int start = 0;
        int end = array.length-1;

        while(start<end){
            swap(array, start,end);
            start++;
            end--;
        }
    }
}


/*
 --------------- output ---------------
 [1, 2, 3, 4, 5, 6]
[6, 5, 4, 3, 2, 1]


 */
