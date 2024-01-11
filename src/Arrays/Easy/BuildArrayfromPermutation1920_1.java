package Arrays.Easy;
//Q: https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class BuildArrayfromPermutation1920_1 {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        permutation(arr);
    }

    public static void permutation(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }

}
