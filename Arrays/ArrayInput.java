package Arrays;

import java.util.Arrays;
import java.util.Scanner;

// taking input and storing it in array
// printing all elements by iterating
public class ArrayInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr1[] = new int[5];

        for (int i=0;i<arr1.length;i++){
            arr1[i] = sc.nextInt();
        }


        // using for loop to iterate
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");  // 1 2 3 4 5
        }

        System.out.println();
        
        // using for each to iterate
        for (int num :arr1) {
            System.out.print(num+" "); // 1 2 3 4 5
        }
        System.out.println();

        // using toString() method of Array class to print array
        System.out.println(Arrays.toString(arr1));  //  [1, 2, 3, 4, 5]



    }
}


/*
------------------ output ------------
1
2
3
4
5
1 2 3 4 5
1 2 3 4 5
[1, 2, 3, 4, 5]


 */
