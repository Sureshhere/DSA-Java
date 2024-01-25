package BinarySearchChapter;

/*
Given a characters array letters that is sorted in non-decreasing order and a character target,
return the smallest character in the array that is larger than target.

Note that the letters wrap around.
    • For example, if target == and letters == ['a', 'b'], the answer is 'a'.

Example 1:
Input: letters = ["c","f", "j"], target = "d"
Output: "f"

Input: letters = ["c","f", "j"], target = "j"
Output: "c"

 */

public class LetterCeiling {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(letterCeiling(letters,target));
    }
    static char letterCeiling(char[] letters, char target){

        int start=0,end=letters.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target > letters[mid]){
                start = mid + 1;
            }
            else if(target < letters[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
