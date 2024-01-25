package LinearSearchChapter;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {5,2,1,8,4,8,-7,0,-3};
        System.out.println(findMin(arr));
    }

    static int findMin(int[] array){
        int minValue = array[0];
        for (int i=0;i<array.length;i++){
            if(array[i]<minValue){
                minValue = array[i];
            }
        }
        return minValue;
    }
}
