package Sorting.Easy;

//https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/

public class SpecialArrayWithXElementsGreaterThanorEqualX1608_27 {
    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(specialArray(nums));
    }

    public static int specialArray(int[] nums) {
        int count = 1; //0,0,3,4,4
        int val = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(count <= nums[j]){
                    val++;
                }
            }

            if(count == val){
                return count;
            }
            count++;
            val = 0;
        }
        return -1;
    }
}
