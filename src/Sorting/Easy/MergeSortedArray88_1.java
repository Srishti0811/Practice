package Sorting.Easy;

//https://leetcode.com/problems/merge-sorted-array/
//https://www.youtube.com/watch?v=73lyz0EZye8

import java.util.Arrays;

public class MergeSortedArray88_1 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    //Without new array. Start adding from last element
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        while(i >= 0) {
            nums1[k] = nums1[i];
            i--;
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }



   /* //With new array
    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[m+n];

        while((nums1.length - nums2.length) > i && nums2.length > j){
            if(nums1[i] < nums2[j]){
                mix[k] = nums1[i];
                i++;
            } else {
                mix[k] = nums2[j];
                j++;
            }
            k++;
        }

        while((nums1.length - nums2.length)  > i){
            mix[k] = nums1[i];
            i++;
            k++;
        }
        while(nums2.length > j){
            mix[k] = nums2[j];
            j++;
            k++;
        }
        return mix;
    }*/
}
