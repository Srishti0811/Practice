package Searching.Medium;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//https://www.youtube.com/watch?v=W9QJ8HaRvJQ&t=3765s

public class PeakIndexInAMountainArray852_10 {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
