package Strings.Easy;

//https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/description/

public class NumberofStringsThatAppearasSubstringsinWord1967_10 {
    public static void main(String[] args) {
        String[] patterns = {"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }
    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;

        for(String p: patterns){
            if(word.contains(p)){
                count++;
            }
        }
        return count;
    }
}
