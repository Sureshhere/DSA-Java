package Arrays;

/*
Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
 */

public class IntToRoman {
    public static void main(String[] args) {
        int x = 1234;
        System.out.println(intToRoman(x));
    }
    static String intToRoman(int num){
        String[] ones = {"","I","II","III","IV","V","VI","VII","VIII","IX"};

        String[] tens = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};

        String[] hun = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};

        String[] thou = {"","M","MM","MMM"};

        return thou[num/1000]+
               hun[num%1000/100]+
               tens[num%100/10]+
               ones[num%10];
    }
}
