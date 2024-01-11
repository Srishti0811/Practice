package Strings.Easy;

//https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome125_16 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    //2 pointer method
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

       int start = 0;
       int end = s.length() - 1;

       while(start <= end){
           if(!Character.isLetterOrDigit(s.charAt(start))){
               start++;
           } else if(!Character.isLetterOrDigit(s.charAt(end))){
               end--;
           } else {
               if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))){
                    return false;
               }
               start++;
               end--;
           }
       }
       return true;
    }

}
