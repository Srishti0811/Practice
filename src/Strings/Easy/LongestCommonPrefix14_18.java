package Strings.Easy;

//https://leetcode.com/problems/longest-common-prefix/description/
//https://leetcode.com/problems/longest-common-prefix/solutions/3174307/well-explained-code-using-strings-in-java/

import java.util.Arrays;

public class LongestCommonPrefix14_18 {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String firstString = strs[0];
        String lastString = strs[strs.length - 1];

        int index = 0;

        while(index < firstString.length() && index < lastString.length()){
            if(firstString.charAt(index) == lastString.charAt(index)){
                index++;
            } else {
                break;
            }
        }
        return firstString.substring(0, index);
    }
}
