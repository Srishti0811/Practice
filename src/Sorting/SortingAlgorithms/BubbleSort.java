package Sorting.SortingAlgorithms;

//After each iteration - largest element is at the end of the array.
//Checks each element - if it big pushes it to the end.
//Time complexity: O(n) - best case when all sorted O(n2) - worst case
//Space complexity: O(1) - no array created - constant
//https://www.youtube.com/watch?v=F5MZyqRp_IM&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=17
//Stable - element of same number - order is not changed
//Good for small dataset

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int[] arr){
        //to check if no swaps - break
        boolean swapped = false;

        for (int i = 0; i < arr.length; i++) {
            //iterate only till length-i as largest element is already in the end after each pass and is sorted.
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){ // break if no swaps - sorted
                break;
            }
        }
        return arr;
    }
}
