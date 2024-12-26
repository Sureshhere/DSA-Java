package Recursion;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80};
        int target = 70;
        System.out.println(binSearch(arr,target,0,arr.length-1));

    }

    static int binSearch(int[] arr,int target,int s,int e){
        if (s>e){
            return -1;
        }
        int mid = s+(e-s)/2;

        if(arr[mid]==target) {
            return mid;
        }
        if (arr[mid]<target){
            return binSearch(arr,target,mid+1,e);
        }
        return binSearch(arr,target,s,mid-1);
    }
}
