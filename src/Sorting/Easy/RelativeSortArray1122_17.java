package Sorting.Easy;

//https://leetcode.com/problems/relative-sort-array/
//https://leetcode.com/problems/relative-sort-array/solutions/335056/java-in-place-solution-using-counting-sort/

import java.util.Arrays;
import java.util.TreeMap;

public class RelativeSortArray1122_17 {
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    //Time: O(N)
    //Space: O(1)
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        int count = 0;

        for(int n: arr1){
            tm.put(n, tm.getOrDefault(n, 0) + 1);
        }

        for(int n: arr2){
            for (int i = 0; i < tm.get(n); i++) {
                arr1[count++] = n;
            }
            tm.remove(n);
        }


        for(int n: tm.keySet()) {
            for (int i = 0; i < tm.get(n); i++) {
                arr1[count++] = n;
            }
        }
        return arr1;
    }
}
