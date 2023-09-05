package Conditionals_Loops;
//1
//12
//1234
//12345

public class NumberPyramid {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
