package BinarySearchChapter;

/*
Example 1:

Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

 */


public class Sqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(9)); //3
    }
    static int mySqrt(int x) {
        long start=1, end = x;

        if(x==0 || x==1){
            return x;
        }

        while(start<=end){
            long mid = start +(end-start)/2;

            if(mid*mid>x){
                end = mid-1;
            }
            else if(mid*mid<x){
                start = mid+1;
            }
            else{
                return (int)mid;
            }
        }
        return (int) end;
    }

}
