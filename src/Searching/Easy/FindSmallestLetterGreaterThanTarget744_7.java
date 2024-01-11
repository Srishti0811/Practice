package Searching.Easy;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//https://www.youtube.com/watch?v=W9QJ8HaRvJQ&t=12528s
//Follow up of floor and ceiling question

public class FindSmallestLetterGreaterThanTarget744_7 {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        if(target >= letters[letters.length - 1]){
            return letters[0];
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];
    }
}
