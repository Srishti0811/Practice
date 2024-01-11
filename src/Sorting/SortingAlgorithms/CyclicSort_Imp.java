package Sorting.SortingAlgorithms;

//Use whenever we have a question with range mentioned as 1 to n.
//Uses index to swap values in one single pass.
//https://www.youtube.com/watch?v=JfinxytTYFQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=20
//Time complexity in both cases: O(n) - linear

import java.util.Arrays;

public class CyclicSort_Imp {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(cyclicSort(arr)));
    }

    //Cant use for loop coz we should not increment i unless the element we are checking is correct, even after swapping is at the correct index.
    /*public static int[] cyclicSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
        return arr;
    }*/

    public static int[] cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                //swap
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        return arr;
    }

}
