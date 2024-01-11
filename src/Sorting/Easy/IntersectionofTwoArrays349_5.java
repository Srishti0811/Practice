package Sorting.Easy;

//https://leetcode.com/problems/intersection-of-two-arrays/description/
//Self

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionofTwoArrays349_5 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    //Time and space complexity: O(n)
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs= new HashSet<>();
        HashSet<Integer> intersection = new HashSet<>();

        for (int n1: nums1) {
            hs.add(n1);
        }

        for (int n2: nums2) {
            if(hs.contains(n2)) {
                intersection.add(n2);
            }
        }

        int i = 0;
        int[] mix = new int[intersection.size()];
        for(Integer s : intersection){
            mix[i++] = s;
        }
        return mix;
    }
}
