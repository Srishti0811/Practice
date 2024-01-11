package Arrays.Easy;
//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import java.util.Arrays;

public class HowManyNumbersAreSmallerThanTheCurrentNumber1365_8 {
    public static void main(String[] args) {
       // int[] nums = {8,1,2,2,3};
        int[] nums = {6,5,4,8};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums){
        int[] arr = new int[nums.length];
        int count;
        for (int i = 0; i < nums.length; i++) {
           count  = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] > nums[j] && i!=j){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}
