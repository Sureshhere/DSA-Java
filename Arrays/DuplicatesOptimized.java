package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Step-1 -> Create a HashSet
Step-2 -> Just loop over input array
Step-3 -> If set deny to store just return true
          (Duplicate already exist)
Step-4 -> If array doesn't contain duplicates return false 
 */
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
