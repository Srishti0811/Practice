package Sorting.Easy;

import java.util.Arrays;
import java.util.HashMap;

//Mainly need to check if they are equal or not.
//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/description/
//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-subarrays/solutions/661521/java-o-n-time-and-space/

public class MakeTwoArraysEqualbyReversingSubarrays1460_24 {
    public static void main(String[] args) {
        int[] target = {1,2,2,3};
        int[] arr = {1,1,2,3};
        System.out.println(canBeEqual(target, arr));
    }

    //Best - O(n) - space and time
    public static boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
            hm.put(target[i], hm.getOrDefault(target[i], 0) - 1);
        }

        for (int i : hm.keySet()) {
            if (hm.get(i) != 0) return false;
        }
        return true;
    }

    //Also a sol
    /*public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(target,arr);
    }*/

}
