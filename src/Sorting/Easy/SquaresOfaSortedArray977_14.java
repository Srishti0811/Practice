package Sorting.Easy;

//https://leetcode.com/problems/squares-of-a-sorted-array/description/
//Nick - https://www.youtube.com/watch?v=PN68qx-Qkdw
import java.util.Arrays;

public class SquaresOfaSortedArray977_14 {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquares(nums)));
    }

    //2 pointer - O(n) for both space and time complexity
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int positive_pointer = 0;

        while (positive_pointer < n && nums[positive_pointer] < 0){
            positive_pointer++;
        }

        int negative_pointer = positive_pointer - 1; //reached negative pointer

        int[] sorted_arr = new int[n];
        int counter = 0;

        while(positive_pointer < n && negative_pointer >= 0){
            if(nums[negative_pointer] * nums[negative_pointer] < nums[positive_pointer]*nums[positive_pointer]){
                sorted_arr[counter] = nums[negative_pointer] * nums[negative_pointer];
                negative_pointer--;
            } else {
                sorted_arr[counter] = nums[positive_pointer]*nums[positive_pointer];
                positive_pointer++;
            }
            counter++;
        }

        while(negative_pointer >= 0){
            sorted_arr[counter] = nums[negative_pointer] * nums[negative_pointer];
            negative_pointer--;
            counter++;
        }
        while(positive_pointer < n){
            sorted_arr[counter] = nums[positive_pointer]*nums[positive_pointer];
            positive_pointer++;
            counter++;
        }

        return sorted_arr;
    }


    //O(nlogn) - Brute force
    public static int[] sortedSquaresBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
