package Sorting.Easy;

//https://leetcode.com/problems/missing-number/description/
//Self
import java.util.Arrays;

public class MissingNumber268_4 {
    public static void main(String[] args) {
        //int[] nums = {3,0,1};
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumberSUM(nums));
    }


    //Not great performance wise
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }

    //OR - total sum - logic
    //Time complexity: O(N)
    //Space Complexity: O(1)
    public static int missingNumberSUM(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int totalSum = n * (n+1) / 2;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        return totalSum - sum;
    }
}
