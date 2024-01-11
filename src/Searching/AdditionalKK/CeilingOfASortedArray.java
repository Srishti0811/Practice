package Searching.AdditionalKK;

//https://www.youtube.com/watch?v=W9QJ8HaRvJQ&t=12528s
//Ceiling: return smallest number greater than or equal to target

public class CeilingOfASortedArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.println(ceilingOfANumber(15, arr));

    }

    public static int ceilingOfANumber(int target, int[] arr){
        //if target element is greater than the greatest no in the array
        //no ceiling

        if(target > arr[arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end  - start) / 2;

            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
