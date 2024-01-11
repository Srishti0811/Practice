package Strings.Easy;

//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/description/
//https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/solutions/1688323/java-1-line-simple-check/

public class CheckifBinaryStringHasatMostOneSegmentofOnes1784_20 {
    public static void main(String[] args) {
        String s = "1001";
        System.out.println(checkOnesSegment(s));
    }

    //Since we know the leading digit is a "1", if the String contains the substring "01" then we know it must contain at least 2 sperate groups of 1s.
    public static boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}

