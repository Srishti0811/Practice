package Sorting.SortingAlgorithms;

//Divide array into 2 parts and sort each part using recursion and pointer
//Merge using pointer method
//https://www.youtube.com/watch?v=iKGAgWdgoRk&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=30
//Time complexity:  O(N*logN)
//Space: O(n)

import java.util.Arrays;

public class MergeSort_Recursion {
    public static void main(String[] args) {
        int[] arr = {4, 5, 1, 2, 3};
        int[] ans = mergeSort(arr); //we can either create a new array ans or store/update in arr.
        System.out.println(Arrays.toString(ans));

        System.out.println("In Place");
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    //Not inplace
    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length / 2;

        //trying to break the array till we have only 1 element left
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        //after left and right is found
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        //if one of the arrays still has elements
        //either of the two loops will run
        while(i < left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }

    //in place
    public static void mergeSortInPlace(int[] arr, int s, int e){
        if(e - s == 1){
            return;
        }

        int m = s + (e-s) / 2;

        mergeSortInPlace(arr, s, m);
        mergeSortInPlace(arr, m, e);

        mergeInPlace(arr, 0, m, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];
        int k = 0;
        int i = s;
        int j = m;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //if elements are remaining
        while(i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        //we need to copy mix array to the original array
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
