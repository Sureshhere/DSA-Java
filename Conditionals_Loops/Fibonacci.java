// PRINT FIBONACCI SERIES UPTO 'n'

package Conditionals_Loops;

import java.util.Scanner;


// INDEX -  0 1 2 3 4 5 6 7
// SERIES - 0 1 1 2 3 5 8 11
public class Fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,n, count=2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n  : ");

        n = sc.nextInt();

        System.out.println("0\n1");
        while (count<=n){
            int temp = a + b;
            a = b;
            b = temp;
            count++;

            System.out.println(b);
        }
    }
}
