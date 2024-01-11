package Arrays.Easy;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesfromSortedArray26_27 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int left = 0;
        for (int right = 1; right < nums.length; right++) {
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
        }
        return left + 1;
    }

}
