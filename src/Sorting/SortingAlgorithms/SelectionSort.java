package Sorting.SortingAlgorithms;

import java.util.Arrays;

//Finds the largest element in the arr and puts it the last.
//Then reduces the last element and looks for max in the next left section.
//https://www.youtube.com/watch?v=Nd4SCCIHFWk&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=18
//Time complexity: O(n2) - best case and worst case
//Space complexity: O(1) - no array created - constant
//not stable - element of same number - order is changed

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1; //same as bubble sort. To avoid iterating when sorted
            int max = getMaxIndex(arr, 0, last);

            //swap
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
        }
        return arr;
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max = 0;

        for (int j = start; j <= last; j++) {
            if(arr[max] < arr[j]){
                max = j;
            }
        }

        return max;
    }
}
