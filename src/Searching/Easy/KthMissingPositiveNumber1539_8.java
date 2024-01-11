package Searching.Easy;

//https://leetcode.com/problems/kth-missing-positive-number/
//https://www.youtube.com/watch?v=BltzCxN1vRc&t=570s
//https://www.youtube.com/watch?v=iWT1cH6LXLc
//https://www.youtube.com/watch?v=uZ0N_hZpyps&t=1028s

public class KthMissingPositiveNumber1539_8 {
    public static void main(String[] args) {
        int[] arr = {2};
       // int[] arr = {2,3,4,7,11};
        int k = 1;
        System.out.println(findKthPositive(arr, k));
    }

    //Brute force using 2 pointers
    //Time: O(n) & space: O(1)
    /*public static int findKthPositive(int[] arr, int k) {
        int i = 0;
        int num = 1;

        while(k > 0 && i< arr.length){
            if(arr[i] == num){
               // num++;
                i++;
            } else {
               // num++;
                k--;
            }
            num++;
        }

        //case: {1,2,3} & k = 2
        //ans: 5
        while(k > 0){
            num++;
            k--;
        }
        return num - 1;
    }*/

    //Binary Search
    //time complexity: O(logN); space: O(1)
    public static int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            int missingTillMid = arr[mid] - (mid+1);
            if(missingTillMid >= k){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start + k;
    }
}
