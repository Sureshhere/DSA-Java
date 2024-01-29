package BinarySearchChapter;

public class FindInMountainArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,3,2,1};
        int target = 3;
        System.out.println(search(arr,target));
    }

    static int search(int[] arr,int target){

        int peakIndex = peakIndexMountainArray(arr,target);
        int start=0,end=peakIndex;
        int element = agnosticBS(arr,target,start,peakIndex);

        if(element!=-1){
            return element;
        }
    return agnosticBS(arr,target,peakIndex+1,arr.length-1);

    }

    static int peakIndexMountainArray(int[] arr, int target){
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

    static int agnosticBS(int[] array, int target,int start,int end){
        boolean isAsc;
        if(array[start]<array[end]){
            isAsc=true;
        }else {
            isAsc=false;
        }

        while(start<=end){

            int mid = start + (end-start)/2;
            if(array[mid]==target){
                return mid;
            }
            if (isAsc){
                if(target<array[mid]){
                    end = mid-1;
                }
                else{
                    start = mid + 1;
                }
            }else {
                if(target<array[mid]){
                    start = mid+1;
                }
                else{
                    end = mid - 1;
                }
            }

        }
        return -1;
    }
}
