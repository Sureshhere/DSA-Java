package BinarySearchChapter;

/*
Flooring => the greatest element smaller than or equal to target element.
suppose,  arr = {2,3,5,9,14,16,18}
ceiling(arr, target=15) : 14

 */
public class FloorNumber {
    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int x = floor(array,1);
        System.out.println("index : "+ x);
    }

    static int floor(int[] array, int target){

        int start=0,end=array.length-1;

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
        return end;
    }
}


/*
OUTPUT :
 index :
-----------

 */