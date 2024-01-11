package Searching.Easy;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/
//https://leetcode.com/problems/check-if-n-and-its-double-exist/solutions/2723608/java-4-approaches-everything-you-d-need/
//https://www.youtube.com/watch?v=wbwHsgoEsxA

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CheckIfNandItsDoubleExist1346_15 {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        //int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }


    //HashSet - best approach O(n)
    public static boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i * 2) || (i % 2 == 0 && set.contains(i / 2))) {
                return true;
            }
            set.add(i);
        }

        return false;
    }

    //HashMap - not too great O(n*n)
    /*public static boolean checkIfExist(int[] arr) {
            Map<Integer, Integer> map = new HashMap<>();
            int n = arr.length;
            for (int i = 0; i < n; i++){
                map.put(arr[i], i);
            }
            for (int i = 0; i < n; i++) {
                if (map.containsKey(2 * arr[i]) &&
                        map.get(2 * arr[i]) != i) {
                    return true;
                }
            }
            return false;
        }*/


        //Brute force
    //Time complexity: O(n2) Space: O(1)
   /* public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i!=j && arr[i] == 2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }*/
}
