package Sorting.Easy;

//https://leetcode.com/problems/maximum-product-of-three-numbers/description/

import java.util.Arrays;

public class MaximumProductofThreeNumbers628_10 {
    public static void main(String[] args) {
        //int[] nums = {1,2,3,4};
        int[] nums = {-100,-98,-1,2,3,4};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        return Math.max((nums[n - 1] * nums[n - 2] * nums[n - 3]), nums[0]* nums[1] * nums[n-1]);
    }
}
