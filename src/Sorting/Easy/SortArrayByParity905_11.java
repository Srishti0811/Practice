package Sorting.Easy;

//https://leetcode.com/problems/sort-array-by-parity/description/
//https://youtube.com/watch?v=y8ZlZNG4T8Y

import java.util.Arrays;

public class SortArrayByParity905_11 {
    public static void main(String[] args) {
        int[] nums = {0,2,1};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));
    }

    //2 pointer sol - optimized sol
    public static int[] sortArrayByParity(int[] nums) {
        int i = 0;
        int j = nums.length - 1;

        while(i<j){
            if(nums[i] % 2 > nums[j] % 2){ // 1 > 0 ==> odd > even => swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[i] % 2 == 0){ //we know for sure that the element is even.
                i++;
            }
            if(nums[j] % 2 == 1){ //we know for sure that the element is odd.
                j--;
            }
        }
        return nums;
    }


    //Brute Force Sol
    public static int[] sortArrayByParityBruteForce(int[] nums) {
        int[] arr = new int[nums.length];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 0){ //Even
                arr[counter] = nums[i];
                counter++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2 == 1) { // Odd
                arr[counter] = nums[i];
                counter++;
            }
        }
      return arr;
    }
}

