package Arrays.Easy;

//https://leetcode.com/problems/maximum-subarray/
//https://www.youtube.com/watch?v=tinz1fiYv0c

// We take max current element nums with previous element of arr
//return the max element in the new array

//{-2, 1, -3, 4, -1, 2, 1, -5, 4} - nums
//{-2, 1, -2, 4, 3, 5, 6, 1, 5} - arr


public class MaximumSubarray53_24 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int[] arr = new int[nums.length];
        int max = nums[0];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = Math.max(nums[i] + arr[i-1], nums[i]);
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}
