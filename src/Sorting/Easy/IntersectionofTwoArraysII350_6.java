package Sorting.Easy;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

import java.util.Arrays;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
public class IntersectionofTwoArraysII350_6 {
    public static void main(String[] args) {
        /*int [] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};*/

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] nums = new int[nums1.length + nums2.length];

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            } else if (nums1[i] < nums2[j]){
                i++;
            } else if (nums1[i] == nums2[j]) {
                nums[k++] = nums1[i];
                i++;
                j++;
            }
        }

        return Arrays.copyOfRange(nums,0, k);
    }


    public int[] intersectWithoutNewArray(int[] nums1, int[] nums2) {
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
