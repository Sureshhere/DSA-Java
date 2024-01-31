package BinarySearchChapter;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {

        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        SearchIn2dArray a = new SearchIn2dArray();

        System.out.println(Arrays.toString(a.searchMatrix(arr,30)));

    }
    public int[] searchMatrix(int[][] matrix, int target) {

        int row =0, col = matrix[0].length-1;

        while (row<matrix.length && col >=0){
            if (matrix[row][col] == target){
                return new int[]{row,col};
            } else if (matrix[row][col] < target) {
                row++;
            }
            else {
                col--;
            }
        }
        return new int[]{-1,-1};

    }
}
