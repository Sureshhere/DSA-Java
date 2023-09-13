package Methods;
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        boolean ans = isArmstrong(num);
        if (ans){
            System.out.println("It is an Armstrong Number.");
        }
        else {
            System.out.println("It is not an Armstrong Number");
        }
    }

    static boolean isArmstrong(int n){
        int original = n,sum=0;
        while (n>0){
            int rem = n % 10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }

        return sum==original;
    }
}
