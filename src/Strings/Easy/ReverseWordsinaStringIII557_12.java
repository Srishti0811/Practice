package Strings.Easy;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

public class ReverseWordsinaStringIII557_12 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    //Can use buffer or builder but builder gives better performance
    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word : words){
            StringBuilder reversedWord = new StringBuilder(word);
            reversedWord.reverse();
            sb.append(reversedWord).append(" ");
        }
        return sb.toString().trim();
    }
}
