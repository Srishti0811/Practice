package Sorting.SortingAlgorithms;

//Sorts left part of the array (Then j is incremented)
//https://www.youtube.com/watch?v=By_5-RRqVeE&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=19
//Best case (where it shines) : O(n) - since we use break. (linear complexity)
//Worst case - O(n2)
//Space complexity : O(n)
//Advantages : 1. Stable 2. Best used in partially sorted dataset (Also used as part of merge, quick sort)
//3. Adaptive : No of swaps reduced compared to bubble sort.

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] insertionSort(int[] arr){
        for (int i = 0; i <= arr.length-2; i++) { // i < arr.length - 1
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else {
                    //if j is less than previous (means everything on the left is sorted.)
                    break;
                }
            }
        }
        return arr;
    }
}
