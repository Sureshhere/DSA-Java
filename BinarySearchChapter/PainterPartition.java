package BinarySearchChapter;

// PAINTER PARITION or Split Array largest sum

/*

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

*/

public class PainterPartition {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int m = 2;
        PainterPartition a = new PainterPartition();
        System.out.println(a.splitArray(nums,m));

    }

    public int isPossible(int[] nums, int mid){

        int count = 1, tempSum =0;
        int n = nums.length;

        for (int i=0;i<n;i++){
            if(tempSum+nums[i]<=mid){
                tempSum += nums[i];
            }
            else {
                count++;
                tempSum = nums[i];
            }
        }
        return count;
    }

    public int splitArray(int[] nums, int m){
        int low=0,high=0;

        for(int i=0;i<nums.length;i++){
            low = Math.max(low,nums[i]);
            high = high + nums[i];
        }

        int ans=0;
        while (low<=high){
            int mid = low + (high-low)/2;

            int count = isPossible(nums,mid);

            if (count<=m){
                high=mid-1;
                ans=mid;
            }
            else {
                low=mid+1;
            }
        }
        return ans;
    }
}
























