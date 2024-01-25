package LinearSearchChapter;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {

        int[][] array = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        int[] ans = search(array,10);
        System.out.println("Found at : "+ Arrays.toString(ans));

    }

    static int[] search(int[][] array, int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{-1,-1};
    }
}
