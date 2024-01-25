package LinearSearchChapter;

import java.util.Arrays;

public class MaxValue2DArray {
    public static void main(String[] args) {

        int[][] array = {
                {10,53,11,6},
                {20,30,40,50},
                {9,10,99,58,71}
        };

        int ans = findMax(array);
        System.out.println("Max value: "+ ans);

    }

    static int findMax(int[][] array){
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]>max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }



}
