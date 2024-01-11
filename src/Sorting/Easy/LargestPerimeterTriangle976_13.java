package Sorting.Easy;

//https://leetcode.com/problems/largest-perimeter-triangle/description/
//https://www.youtube.com/watch?v=_JAjD9xQk6A

import java.util.Arrays;

public class LargestPerimeterTriangle976_13 {
    public static void main(String[] args) {
        int nums[] = {1,2,1,10};
    }

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        //since its sorted we only need to check one condition:
        //L3>L2>L1 ==> L3 > L2+L2

        //no need to check:  L1 > L2+L3 or  L2 > L1+L3

        //to get the largest perimeter
        //property of triangle = sum of any 2 side should be larger than third side.
        for (int i = nums.length - 1; i >= 2; i--) {
            if(nums[i] < nums[i-1] + nums[i-2]){
                return nums[i] + nums[i-1] + nums[i-2];
            }
        }
        return 0;
    }
}
