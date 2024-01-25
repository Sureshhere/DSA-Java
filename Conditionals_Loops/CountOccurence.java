package Conditionals_Loops;

// count occurence of an integer
public class CountOccurence {
    public static void main(String[] args) {
        int a = 1233331,count=0;

        while (a>0){
            int rem = a%10;
            if(rem==3){
                count++;
            }
            a = a/10;
        }
        System.out.println("count of '3' : "+count);
    }
}
