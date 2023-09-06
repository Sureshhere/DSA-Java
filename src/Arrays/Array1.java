package Arrays;

// creating an array
// two ways to do it :
//      datatype[] refVariable = new datatype[size];
//      datatype[] refVariable = {elements};
public class Array1 {
    public static void main(String[] args) {
        String[] arr1 = new String[5]; // array 1
        arr1[0] = "Suresh";
        arr1[1] = "Ramesh";
        arr1[2] = "Dinesh";
        arr1[3] = "Ganesh";
        arr1[4] = "Mahesh";

        float[] arr2 = new float[3]; // array 2 (null array)
        System.out.println(arr2[1]);


        int[] arr3 = {10,30,50,70,90}; // array 3

        System.out.println(arr1[0]);
        System.out.println(arr3[1]);

    }
}
