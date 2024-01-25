package LinearSearchChapter;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = {5,23,65,7,12,95,1,56,4};
        int index = linear_search(arr,5);
        System.out.println("5 Found at index : "+index);  // 5 Found at index : 0

    }

    static int linear_search(int[] array , int x){
        if(array.length==0){
            return -1;
        }

        for(int i=0;i<array.length;i++){
            if (array[i]==x){
                return i;
            }
        }
        // if no element found return -1
        return -1;
    }
}


