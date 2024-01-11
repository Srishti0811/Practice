package Sorting.Easy;

//https://leetcode.com/problems/contains-duplicate/description/
// Easy to understand

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate217_3 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        //int[] nums = {0,4,5,0,3,6};
        System.out.println(containsDuplicate(nums));
    }

    /*public static boolean containsDuplicate(int[] nums) {
        //Sort the array - bubble sort
        //bubbleSort(nums); - giving time limit exceeds exception

        Arrays.sort(nums);

        //now use pointers
        int pointer_a = 0;
        int pointer_b = 1;

        while(pointer_b < nums.length){
            if(nums[pointer_a] == nums[pointer_b]){
                return true;
            }
            pointer_a++;
            pointer_b++;
        }
        return false;
    }*/

    //OR
    //Time complexity: O(nlog(n))
    //Space complexity: O(log(n))
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }


    /*private static void bubbleSort(int[] nums) {
        boolean swapped = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[j] < nums[j-1]){
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                return;
            }
        }
    }*/

    //HM
    //Time complexity: O(n)
    //Space complexity: O(n)
    public static boolean containsDuplicateMaps(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int j = 0; j < nums.length; j++) {
            if(hm.containsKey(nums[j])) {
                return true;
            } else {
                hm.put(nums[j], 1);
            }
        }
        return false;
    }

    //HS
    //Time complexity: O(n)
    //Space complexity: O(n)
    public static boolean containsDuplicateSets(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                if (set.contains(nums[i])) {
                    return true;
                }
                set.add(nums[i]);
            }
            return false;
        }

}
