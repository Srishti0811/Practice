package Sorting.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/minimum-absolute-difference/description/
//https://leetcode.com/problems/minimum-absolute-difference/solutions/388289/java-sorting-beats-100-explained/

public class MinimumAbsoluteDifference1200_18 {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(arr));
    }


    //O(nlgn) time - Onlg for sorting and On to form the result list.
    // Space is O(1) - just several state variables.
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList();
        //sort elements
        Arrays.sort(arr);
        //init our min difference value
        int min = Integer.MAX_VALUE;
        //start looping over array to find real min element. Each time we found smaller difference
        //we reset resulting list and start building it from scratch. If we found pair with the same
        //difference as min - add it to the resulting list
        for (int i = 0; i < arr.length - 1; i++) {
            int diff = arr[i + 1] - arr[i];
            if (diff < min) {
                min = diff;
                res.clear();
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            } else if (diff == min) {
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }

            //OR to remove duplication:
            /*if (diff < min) {
                min = diff;
                res.clear();
            }
                res.add(Arrays.asList(arr[i], arr[i + 1]));
            }*/
        }
        return res;
    }

    //Myself
    public static List<List<Integer>> minimumAbsDifferenceSort(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
       int minAbs = Integer.MAX_VALUE;
       int i =  0;
       int j = 1;
        while (j < arr.length){
            int diff = Math.abs(arr[j] - arr[i]);
            if(diff < minAbs){
                minAbs = diff;
            }
            i++;
            j++;
        }

        int k = 0;
        int l = 1;
        while(l < arr.length){
                if(Math.abs(arr[l] - arr[k]) == minAbs) {
                    ArrayList<Integer> a = new ArrayList<>();
                    a.add(arr[k]);
                    a.add(arr[l]);
                    res.add(a);
                }
                k++;
                l++;
        }
        return res;
    }
}
