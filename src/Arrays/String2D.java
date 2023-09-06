package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class String2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] arr = new String[3][3];

        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextLine();
            }
        }

        // output using for each loop

        for (String a[] : arr){
            System.out.println(Arrays.toString(a));
        }


    }
}

/*
---------------- output --------------
suresh
ramesh
dinesh
mukesh
rajesh
ganesh
mahesh
deepesh
kamlesh

[suresh, ramesh, dinesh]
[mukesh, rajesh, ganesh]
[mahesh, deepesh, kamlesh]
*/