package Methods;

import java.util.Scanner;

public class PermutationCombinations {
    public static void main(String[] args) {
        int n,r;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 'n' value : ");
        n = input.nextInt();
        System.out.print("Enter 'r' value : ");
        r = input.nextInt();

        // nCr
        int ncr = (fact(n))/(fact(r)*fact(n-r));
        int npr = (fact(n))/fact(n-r);

        System.out.println("NCR for n="+n+"and r="+r+"->"+ncr);
        System.out.println("NPR for n="+n+"and r="+r+"->"+npr);
    }

    static int fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        int factorial = fact(n-1)*n;
        return factorial;
    }
}
