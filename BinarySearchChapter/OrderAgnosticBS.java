package BinarySearchChapter;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] ascArray = {-7,-2,0,2,5,10,15,71};
        int[] dscArray = {20,15,12,9,6,4,0,-2};
        int x = agnosticBS(dscArray,-2);
        System.out.println(x);
    }
    static int agnosticBS(int[] array, int target){


        int start=0,end=array.length-1;

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
