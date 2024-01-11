package Sorting.Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//https://www.youtube.com/watch?v=oEBHLcucDYg

public class FindAllNumbersDisappearedinanArray448_28 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    //-ve approach. Each time we reach a no make it negative. Then return the positive numbers
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();

        for(int i=0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0){
                continue;
            }
            nums[index] = nums[index] * -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > 0){
                l.add(i+1);
            }
        }
        return l;
    }


    //OR
    public static List<Integer> findDisappearedNumbersSets(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet hs = new HashSet<>();

        for(int n : nums){
           hs.add(n);
        }

        for (int i = 1; i <= nums.length; i++) {
            if(!hs.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}
