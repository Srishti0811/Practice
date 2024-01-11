package Arrays.Easy;
//https://leetcode.com/problems/running-sum-of-1d-array/
import java.util.Arrays;

public class RunningSumof1dArray1480_3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }

    public static int[] runningSum(int[] nums) {
        int l = nums.length;
        for(int i=1; i<l; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
