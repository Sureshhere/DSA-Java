public class StringBuilderProgram {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");

        for (int i = 0; i < str.length()/2; i++) {

            int frontIndex = i;
            int backIndex = str.length()-1-i;

            char frontChar = str.charAt(frontIndex);
            char backChar = str.charAt(backIndex);

            str.setCharAt(frontIndex,backChar);
            str.setCharAt(backIndex,frontChar);
        }
        System.out.println(str);

    }
}
