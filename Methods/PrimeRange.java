package Methods;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int start, end;
        System.out.print("Enter a starting range : ");
        start = input.nextInt();
        System.out.print("Enter a ending range : ");
        end = input.nextInt();


        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i <= 1) {
                isPrime = false;
            }
            else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }

                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }


    }
}
