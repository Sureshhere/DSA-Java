package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesOptimized {

    public static void main(String[] args) {
        int[] arr = {1,2,4,51,1};
        DuplicatesOptimized a = new DuplicatesOptimized();
        System.out.println(a.containsDuplicate(arr));
    }
    public boolean containsDuplicate(int[] nums) {
        Set set = new HashSet();
        for(int num:nums){
            if(!set.add(num)) return true;
        }
        return false;
    }
}
