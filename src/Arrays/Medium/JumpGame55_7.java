package Arrays.Medium;

//https://leetcode.com/problems/jump-game/
//Sol 1: https://www.youtube.com/watch?v=Zb4eRjuPHbM
//Sol 2: https://www.youtube.com/watch?v=muDPTDrpS28
public class JumpGame55_7 {
    public static void main(String[] args) {
        //int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        //start in the reverse order as that's the objective
        int lastGoodIndexPosition = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if(i + nums[i] >= lastGoodIndexPosition){
                lastGoodIndexPosition = i;
            }
        }
        return lastGoodIndexPosition == 0;
    }

    /*public boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i = 0; i < nums.length; i ++) {
            if(i > reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }
        return true;
    }*/


}
