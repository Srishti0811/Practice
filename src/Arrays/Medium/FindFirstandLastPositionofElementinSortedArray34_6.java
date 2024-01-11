package Arrays.Medium;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
//mostly through KK Binary search videos

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray34_6 {
    public static void main(String[]args){
        int[] nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums, 8)));

    }

    public static int[] searchRange(int[] nums, int target) {
        int[] arr = {-1,-1};

        int first = binarySearch(nums, target, true);
        int second = binarySearch(nums, target, false);

        arr[0] = first;
        arr[1] = second;
        return arr;
    }

    public static int binarySearch(int[] nums, int target, boolean isFirstIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start<=end) {
            int mid = start + (end - start) / 2;

            if(target > nums[mid]){
                start = mid + 1;
            } else if(target < nums[mid]){
                end = mid - 1;
            } else if(target == nums[mid]){
                ans = mid;
                if(isFirstIndex){
                   end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
