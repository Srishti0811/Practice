package Sorting.Easy;

import java.util.Arrays;
import java.util.TreeMap;

public class HeightChecker1051_16 {
    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }

    //Sorting
    public static int heightChecker(int[] heights) {
        int[] arr = heights.clone();
        Arrays.sort(arr);
        int res = 0;

        for (int i = 0; i < heights.length; i++) {
                if(arr[i] != heights[i]){
                    res++;
                }
            }
        return res;
    }


    //Myself
    public static int heightCheckerTM(int[] heights) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int[] arr = new int[heights.length];
        int count = 0;

        //sort the array
        //then compare using pointers.

        for (int i = 0; i < heights.length; i++) {
            tm.put(heights[i], tm.getOrDefault(heights[i],0) + 1);
        }

        for(int n: tm.keySet()){
            for (int i = 0; i < tm.get(n); i++) {
                arr[count++] = n;
            }
        }

        int i = 0;
        int j = 0;
        int expected = 0;
        while(i < arr.length && j < heights.length){
            if(arr[i] != heights[j]){
                expected++;
            }
            i++;
            j++;
        }
    return expected;
    }
}
