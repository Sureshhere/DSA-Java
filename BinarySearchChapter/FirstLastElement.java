package BinarySearchChapter;

// INPUT : [5,7,7,8,8,10,] target = 8
// OUTPUT : [3,4]

import java.util.Arrays;

public class FirstLastElement {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        FirstLastElement a = new FirstLastElement();
        System.out.println(Arrays.toString(a.searchFirstLast(arr,8)));

    }

    public int[] searchFirstLast(int[] arr,int target){
        int s=0,e=arr.length-1;
        int[] ans = {-1,-1};

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                ans[0]=mid;
                e=mid-1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        s = 0;
        e = arr.length-1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(arr[mid]==target){
                ans[1]=mid;
                s=mid+1;
            } else if (arr[mid]<target) {
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return ans;
    }
}
