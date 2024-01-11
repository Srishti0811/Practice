package Searching.Easy;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/
//https://www.youtube.com/watch?v=B9L2hjjQCN0&t=399s

import java.util.Arrays;

public class IntersectionofTwoArraysII350_13 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[nums1.length * nums2.length];

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else {
                ans[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(ans, 0, k);
    }

    //for inplace
    public static int[] intersection1(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        //remove this
       /* int[] ans = new int[nums1.length * nums2.length];*/

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                i++;
            } else if(nums1[i] > nums2[j]){
                j++;
            } else {
                nums1[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }

}
