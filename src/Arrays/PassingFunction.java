package Arrays;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] a = {1,0,3,4};
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));
    }
    static void change(int[] arr){
        arr[1]=2;
    }
}
/*
------------------ output ------------
[1, 0, 3, 4]
[1, 2, 3, 4]
 */