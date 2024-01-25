package Arrays;

import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {10,50,2,1,5,22,3,26};

        System.out.println(Arrays.toString(arr));

        int ans = findMax(arr);
        System.out.println("Max value : "+ans);
    }

    static int findMax(int[] array){

        int max = array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
            }
        }

        return max;
    }
}

/*
[10, 50, 2, 1, 5, 22, 3, 26]
Max value : 50
 */
