package LinearSearchChapter;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Suresh";
        char target = 'r';
        System.out.println(search(name,target)); // true

    }

    static boolean search(String word, char target){
        if(word.length()==0){
            return false;
        }
        for (int i=0; i<word.length();i++){
            if(word.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
