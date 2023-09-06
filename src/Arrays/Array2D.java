package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr1 = new int[3][];

        int[][] arr2 = {
                {1,2,3},
                {1,2},
                {1,2,3,4}
        };

        System.out.println(Arrays.toString(arr2[0]));
        
        // taking input

        // ---- CASE 1 : when row and col is known ----
        System.out.println("Enter elements for array 1:");
        int[][] a = new int[3][3];
        for(int i=0;i<3;i++){
            for (int j = 0; j < 3; j++) {
                a[i][j] = input.nextInt();
            }
        }
        System.out.println("Element [0] of array 1 : "+Arrays.toString(a[0]));


        // ---- CASE 2 : when row and col is not known ----
        System.out.println("Enter elements for array 2:");

        int[][] b = new int[3][3];


        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = input.nextInt();
            }
        }
        System.out.println("Element [0] of array 1 : "+Arrays.toString(b[0]));
    }
}



/*
  -----------    OUTPUT    ------------
        [1, 2, 3]
        Enter elements for array 1:
        1
        2
        3
        4
        5
        6
        7
        8
        9
        Element [0] of array 1 : [1, 2, 3]
        Enter elements for array 2:
        10
        20
        30
        40
        50
        60
        70
        80
        90
        Element [0] of array 1 : [10, 20, 30]

*/