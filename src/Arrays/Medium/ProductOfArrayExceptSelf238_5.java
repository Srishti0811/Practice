package Arrays.Medium;

//https://leetcode.com/problems/product-of-array-except-self/
//https://www.youtube.com/watch?v=tSRFtR3pv74
import java.util.Arrays;

public class ProductOfArrayExceptSelf238_5 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] output_arr = new int[nums.length];
        output_arr[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            output_arr[i] = nums[i-1] * output_arr[i-1];
        }

        int R = 1;
        for (int i = nums.length - 1; i >=0; i--) {
            output_arr[i] = output_arr[i] * R;
            R = R * nums[i];
        }

        return output_arr;
    }
}
