package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 7;
        TwoSum obj = new TwoSum();
        System.out.println(Arrays.toString(obj.twoSum(arr,target)));
    }
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};

    }
}