package Strings.Easy;

//https://leetcode.com/problems/valid-palindrome-ii/description/

public class ValidPalindromeII680_17 {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }
    public static boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }

    //OR
    //Recursive pointer approach:
    public boolean validPalindrome(String s, int count, int start, int end) {
        if(count>1){
            return false;
        }
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return validPalindrome(s, count+1, start+1, end) || validPalindrome(s, count+1, start, end-1);
            }
            else{
                start++;
                end--;
            }
        }
        return true;
    }
}
