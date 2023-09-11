package Methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter a number : ");
        num = input.nextInt();

        if(num==1){
            System.out.println(num+" is not a prime number");
        } else if (num > 1) {
            boolean flag = true;

            for(int i=2;i<num;i++){
                if(num % i==0){
                    flag = false;
                    break;
                }
            }

            if (flag == true){
                System.out.println(num+" is Prime number");
            }
            else {
                System.out.println(num+"is not a Prime number");
            }

        }
        else {
            System.out.println(num+"is not a prime number");
        }



    }
}
