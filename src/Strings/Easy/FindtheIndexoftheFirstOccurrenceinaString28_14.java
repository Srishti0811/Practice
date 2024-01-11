package Strings.Easy;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class FindtheIndexoftheFirstOccurrenceinaString28_14 {
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }
}
