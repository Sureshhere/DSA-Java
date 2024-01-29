package BinarySearchChapter;

// Condition :      arr[i-1]<arr[i]>arr[i]

public class PeakIndexMountainArray {
    public static void main(String[] args) {

        int[] arr = {4,2,7,8,9,5,3,1};
        int x = peakElement(arr);
        System.out.println(x);
    }
    static int peakElement(int[] arr){
        int start = 0, end = arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                // descending part, so
                end=mid;
            }
            else {
                //ascending part,
                start=mid+1;
            }
        }
        return start;
    }
}
