package BinarySearchChapter;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {-7,-2,0,2,5,10,15,71};
        int x = binarySearch(array,2);
        System.out.println(x);
    }

    static int binarySearch(int[] array, int target){

        int start=0,end=array.length-1;
//        int mid = (start+end)/2; // start + end can exceed the size of int in java

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<array[mid]){
                end = mid-1;
            }
            else if (target>array[mid]){
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
