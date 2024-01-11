package Sorting.Easy;

//https://leetcode.com/problems/sort-array-by-parity-ii/description/
//https://www.youtube.com/watch?v=pHRFRZGbK5s

import java.util.Arrays;

public class SortArrayByParityII922_12 {
    public static void main(String[] args) {
        //int[] nums = {4,2,5,7};
        int[] nums = {3,4};
        System.out.println(Arrays.toString(sortArrayByParityII(nums)));
    }


    //two pointer method - in place sorting
    public static int[] sortArrayByParityII(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = 1;

        while(i < nums.length && j < nums.length){
            while(i < nums.length && nums[i] % 2 == 0){
                i = i + 2;
            }
            while(j < nums.length && nums[j] % 2 == 1){
                j = j + 2;
            }
            if(i < nums.length && j < nums.length){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        return nums;
    }

    //Brute Force
    public static int[] sortArrayByParityIIBrute(int[] nums) {
        int[] arr = new int[nums.length];

        int even = 0;

        for(int n : nums){
            if(n%2 == 0){
                arr[even] = n;
                even += 2;
            }
        }

        int odd = 1;
        for(int n : nums){
            if(n%2 == 1){
                arr[odd] = n;
                odd += 2;
            }
        }
        return arr;
    }
}
