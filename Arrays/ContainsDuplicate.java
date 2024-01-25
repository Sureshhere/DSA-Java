package Arrays;

/*
Input: nums = [1,2,3,1]
Output: true


Input: nums = [1,2,3,4]
Output: false
 */
public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1}; // true
        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
