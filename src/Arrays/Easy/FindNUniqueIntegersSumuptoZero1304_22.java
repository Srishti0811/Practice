package Arrays.Easy;

//https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/

import java.util.Arrays;

public class FindNUniqueIntegersSumuptoZero1304_22 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(6)));
    }

    public static int[] sumZero(int n) {
        int[] arr = new int[n];

        if(n%2 == 0){
            for (int i = 0; i < n; i = i+2) {
                arr[i] = i+1;
                arr[i+1] = -(i+1);
            }
        } else {
            for (int i = 0; i < n-1; i =i+2) {
                arr[i] = i+1;
                arr[i+1] = -(i+1);
            }
            arr[n-1] = 0;
        }
        return arr;
    }
}
