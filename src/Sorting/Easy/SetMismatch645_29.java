package Sorting.Easy;

//https://leetcode.com/problems/set-mismatch/description/

import java.util.Arrays;
import java.util.HashSet;

public class SetMismatch645_29 {
    public static void main(String[] args) {
        int[] nums = {3,2,2};
        System.out.println(Arrays.toString(findErrorNumsSets(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] arr = new int[2]; // 3,2,3,4,6,5 - 3-1 = 2
        //Arrays.sort(nums); //3,-2,-3,-4,-6,-5

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                continue;
            }
            nums[index] = nums[index] * -1;
        }

            for (int j = 0; j < nums.length; j++) {
                if(nums[j] > 0){
                    arr[0] = nums[j];
                    arr[1] = j+1;
                }
            }
        return arr;
    }

    public static int[] findErrorNumsSets(int[] nums) {
        HashSet<Integer> hs = new HashSet<>(); //3,2,2
        int dup = 0;

        // find duplicate using set
        for (int i = 0; i < nums.length; i++) {
            if(hs.contains(nums[i])){
                dup = nums[i];
            }
            hs.add(nums[i]);
        }

        // find missing
        int missing = 0;
        for (int i = 1; i < nums.length; i++) {
            if(!hs.contains(i)){
                missing = i;
                break;
            }
        }

        return new int[]{dup, missing};
    }
}

