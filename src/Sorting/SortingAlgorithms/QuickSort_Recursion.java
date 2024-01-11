package Sorting.SortingAlgorithms;

//https://www.youtube.com/watch?v=Z8svOqamag8&t=802s
// choose one element as pivot (can be any). after first pass all elements less than pivot will be on the LHS and all elements greater than pivot will be on the RHS
//First bring pivot at the correct position. Then call recursion for sorting the rest.
//Best case time complexity: O(nlogn)
//Worse case time complexity: O(n2)
//Properties: 1. Not stable, 2. preferred over merge sort as we dont use extra mix array
//instead sort in place, 3. Merge sort is better in case of LinkedList (as its not continuous memory allocation like array.)
//Prefer quick sort to merge as it stops swapping when array is sorted unlike merge sort.

//Arrays.sort - uses quick sort internally with dual pivots as well as insertion n all.

import java.util.Arrays;

public class QuickSort_Recursion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int m = s + (e-s) / 2;
        int pivot = arr[m];

        while(s<=e){
            //correct position
            while(arr[s] < pivot){
                s++;
            }
            //correct position
            while(arr[e] > pivot){
                e--;
            }

            //also reason why if already sorted it doesn't swap.
            if(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }

        //now my pivot is at the right index, sort the other two halves now
        //because after above while loop: e crosses s
        quickSort(arr, low, e);
        quickSort(arr, s, high);
    }
}
