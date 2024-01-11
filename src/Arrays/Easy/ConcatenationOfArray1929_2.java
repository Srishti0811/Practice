package Arrays.Easy;
//https://leetcode.com/problems/concatenation-of-array/
import java.util.Arrays;

public class ConcatenationOfArray1929_2 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + length] = nums[i];
        }
        return ans;
    }
}
