package Conditionals_Loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int n = 123,num=0;

        while(n>0){
            int rem = n%10;
            n = n/10;

            num = num * 10 + rem;
        }
        System.out.println(num);
    }
}
