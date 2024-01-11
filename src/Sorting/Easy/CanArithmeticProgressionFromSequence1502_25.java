package Sorting.Easy;

//https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/
//Myself

import java.util.Arrays;

public class CanArithmeticProgressionFromSequence1502_25 {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        //int[] arr = {1,2,4};
        System.out.println(canMakeArithmeticProgression(arr));
    }

    //Time Complexity = O(NlogN), Space Complexity = O(1)
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int dif = arr[1] - arr[0];

        int i = 0;
        int j = 1;
            while(j < arr.length){
                if(arr[j] - arr[i] != dif){
                    return false;
                }
                i++;
                j++;
            }
        return true;
    }
}
