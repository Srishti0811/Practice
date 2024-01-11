package Strings.Easy;

//https://leetcode.com/problems/determine-if-string-halves-are-alike/description/

import java.util.HashSet;

public class DetermineifStringHalvesAreAlike1704_8 {
    public static void main(String[] args) {
        String s = "Uo";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        HashSet<Character> set = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray())
            set.add(c);

        int count = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (set.contains(s.charAt(i))) count++;
            if (set.contains(s.charAt(i + s.length() / 2))) count--;
        }

        return count == 0;
    }
}
