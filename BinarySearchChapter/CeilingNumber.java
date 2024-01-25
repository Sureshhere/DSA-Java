package BinarySearchChapter;

/*
CEILING => smallest element in array greater than or equal to target element
suppose,  arr = {2,3,5,9,14,16,18}
ceiling(arr, target=15) : 16

 */
public class CeilingNumber {
    public static void main(String[] args) {
        int[] array = {2,3,5,9,14,16,18};
        int x = ceiling(array,15);
        System.out.println("index : "+ x);
    }

    static int ceiling(int[] array, int target){

        int start=0,end=array.length-1;
        if(target>array[array.length-1]){
            return -1;
        }
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
        return start;
    }
}


/*
OUTPUT :
 index : 5
-----------
5 is the index
and element at index 5 is 16

so 16 is the smallest number that is >= target (15)
 */