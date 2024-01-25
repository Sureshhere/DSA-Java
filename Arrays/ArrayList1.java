package Arrays;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(5);

        // adding elements
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6); // it is an extra element an init size is 5

        System.out.println("original array list : " + list1);

        // remove last element
        list1.remove(5);
        System.out.println("removed last element : " + list1);

        // check for a value
        System.out.println("Contains 2 : "+ list1.contains(2));
        System.out.println("Contains 10 : "+ list1.contains(10));

        // get an element using index
        System.out.println("Element at index '2' : "+list1.get(2));

        // set a new value for an existing element
        list1.set(0,100);
        System.out.println(" Setting value  '1' ->  '100' : "+list1);



    }
}


/*
------------ output -----------

original array list : [1, 2, 3, 4, 5, 6]
removed last element : [1, 2, 3, 4, 5]
Contains 2 : true
Contains 10 : false
Element at index '2' : 3
 Setting value  '1' ->  '100' : [100, 2, 3, 4, 5]

 */
