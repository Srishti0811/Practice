package Strings.Easy;

public class ReversePrefixofWord2000_22 {
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word, ch));
    }

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        String firstHalf = word.substring(0, index + 1);
        String secondHalf = word.substring(index + 1); // or word.substring(index + 1, word.length());
        StringBuilder sb = new StringBuilder(firstHalf);
        sb.reverse();
        return sb.append(secondHalf).toString();
    }
}
