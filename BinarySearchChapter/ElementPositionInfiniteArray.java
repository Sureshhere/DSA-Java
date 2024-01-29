package BinarySearchChapter;

public class ElementPositionInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int x = infiteArrayBS(arr,7);
        System.out.println("Position : "+x);
    }

    static int infiteArrayBS(int[] arr, int target){
        int start=0,end=1;
        while (target>arr[end]){
            start=end;
            end=end*2;
        }
        return binarySearch(arr,start,end,target);
    }

    static int binarySearch(int[] array,int start,int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<array[mid]){
                end = mid-1;
            }else if (target>array[mid]){
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
