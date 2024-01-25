package LinearSearchChapter;

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {1,0,0,12,0,14,74,-54};

        System.out.println(findNumbers(nums));
    }

    static int  findNumbers(int[] array) {
        int count = 0;
        for(int i : array){
            // using optimized method [ even2() ]
            if(even2(i)){
                count++;
            }
        }
        return count;
    }

//     SIMPLE LOGIC TO KNOW Whether the num is even or not
    static boolean even(int x){
        if (x<0){
            x = x * -1;
        }
        if(x==0){
            return false;
        }
        int evenCounter = 0;
        while (x>0) {
            evenCounter++;
            x /= 10;
        }
        if(evenCounter%2==0){
            return true;
        }
        return false;
    }


//     OPTIMIZED METHOD TO know whether the num is even or not
    static boolean even2(int x){
        if (x<0){
            x = x * -1;
        }
        if(x==0){
            return false;
        }
        int count = (int) Math.log10(x)+1;
        if (count%2==0){
            return true;
        }
        return false;
    }
}
