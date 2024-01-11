package Strings.Easy;

//https://leetcode.com/problems/maximum-repeating-substring/

public class MaximumRepeatingSubstring1668_19 {
    public static void main(String[] args) {
        String sequence = "ababc";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }

    public static int maxRepeating(String sequence, String word) {
        int repeating = 0;
        StringBuilder sb = new StringBuilder(word);
        while (sequence.contains(sb)) {
            repeating++;
            sb.append(word);
        }
        return repeating;
    }
}

