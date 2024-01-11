package Sorting.Easy;

//https://leetcode.com/problems/third-maximum-number/

import java.util.*;

public class ThirdMaximumNumber414_7 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        System.out.println(thirdMax(nums));
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set = new HashSet<>();
        for (int i = nums.length-1; i >= 0; i--) {
            set.add(nums[i]);
            if(set.size() ==  3){
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static int thirdMaxNoCollection(int[] nums) {
        Integer max = null, max2nd = null, max3rd = null;

        for (Integer n : nums) {
            if (n.equals(max) || n.equals(max2nd) || n.equals(max3rd)) {
                continue;
            }

            if (max == null || n > max) {
                max3rd = max2nd;
                max2nd = max;
                max = n;
            }
            else if (max2nd == null || n > max2nd) {
                max3rd = max2nd;
                max2nd = n;
            }
            else if (max3rd == null || n > max3rd) {
                max3rd = n;
            }
        }

        return (max3rd == null) ? max : max3rd;
    }

}

