package Sorting.Easy;

//https://leetcode.com/problems/array-partition/
//https://www.youtube.com/watch?v=Qmh3k8l-bIc

import java.util.Arrays;

public class ArrayPartition561_9 {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length -1 ; i = i +2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}

