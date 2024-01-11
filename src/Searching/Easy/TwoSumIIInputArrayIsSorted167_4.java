package Searching.Easy;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSumIIInputArrayIsSorted167_4 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int pointer_a = 0;
        int pointer_b = numbers.length-1;

        while(pointer_a < pointer_b){
            int sum = numbers[pointer_a] + numbers[pointer_b];

            if(sum == target){
                return new int[]{pointer_a + 1, pointer_b + 1};
            } else if (sum > target) {
                pointer_b--;
            } else {
                pointer_a++;
            }
        }
        return new int[]{pointer_a + 1, pointer_b + 1};
    }
}
