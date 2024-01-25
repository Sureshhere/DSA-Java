package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2 ,4};

        System.out.println(Arrays.toString(arr));

        swap(arr, 1, 2);

        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] array, int x, int y){
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

/*
[1, 3, 2, 4]
[1, 2, 3, 4]
 */

