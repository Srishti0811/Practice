package Searching.Easy;

//https://leetcode.com/problems/intersection-of-two-arrays/description/
//https://www.youtube.com/watch?v=w5mBjxL1pok

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays349_12 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for(Integer num : nums1){
            set1.add(num);
        }
        for (Integer n: nums2){
            if(set1.contains(n)){
                intersection.add(n);
            }
        }

        int i = 0;
        int[] ans = new int[intersection.size()];
        for (Integer s: intersection){
            ans[i++] = s;
        }
        return ans;
    }


}
