package Strings.Easy;

//https://leetcode.com/problems/merge-strings-alternately/description/

public class MergeStringsAlternately1768_21 {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(mergeAlternately(word1, word2));
    }

    //More optimized
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
            i++;
        }
        return result.toString();
    }


    //Myself
    public static String mergeAlternatelyNew(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while(i<word1.length() && j< word2.length()){
            sb.append(word1.charAt(i));
            i++;
            sb.append(word2.charAt(j));
            j++;
        }

        while(i < word1.length()){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j < word2.length()){
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }
}
