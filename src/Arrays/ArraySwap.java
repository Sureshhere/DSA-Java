package Arrays;

import java.util.ArrayList;

public class ArrayListSwap {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(3);

        list1.add(1);
        list1.add(3);
        list1.add(2);
        System.out.println(list1);

        swap(list1,1,2);
    }

    static void swap(ArrayList<Integer> arrList, int x, int y){
        int temp = arrList.get(x);
        arrList[x] = arrList.get(y);

    }
}

