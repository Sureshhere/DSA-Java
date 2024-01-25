package LinearSearchChapter;

/*
Input : [[1,5],[7,3],[3,5]]
Output : 10
Explanation :
    customer 2 is richest with wealth of 10
            --> 7 + 3 = 10
----------------
   0 1
0 [1,5]
1 [7,3]
2 [3,5]
 */
public class RichestCustomer {
    public static void main(String[] args) {

        int[][] accounts = {{1,5},{7,3},{8,5}};
        System.out.println(findRichest(accounts));
    }

    static int findRichest(int[][] array){
        int highWealth=0,sum=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
                if (sum>highWealth){
                    highWealth =sum;
                }
            }
            sum=0;
        }
        return highWealth;
    }
}
