package Sorting.Easy;

//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/description/
//Myself

import java.util.Arrays;

public class MaximumProdutofTwoElementsinanArray1464_22 {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        System.out.println(maxProductFast(nums));
    }

    //Fastest:
    public static int maxProductFast(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > max){
                sec_max = max;
                max = nums[i];
            }
            else if(nums[i] >= sec_max){
                sec_max = nums[i];
            }
        }

        return ((max-1)*(sec_max-1));
    }

    //Better
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public static int maxProductProd(int[] nums) {
        //Arrays.sort(nums);
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                int val = (nums[i] - 1) * (nums[j] - 1);
                if(i!=j && (val > count)){
                    count = val;
                }
            }
        }
        return count;
    }
}
