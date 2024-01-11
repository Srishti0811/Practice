package Searching.Easy;

//https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/
//Pointer: https://www.youtube.com/watch?v=NoLIX84wLVc
//BS: https://www.youtube.com/watch?v=64N-jHG595Q

public class CountNegativeNumbersinaSortedMatrix1351_11 {
    public static void main(String[] args) {
       // int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};

        int[][] grid = {{3,2},{1,0}};

        System.out.println(countNegatives(grid));
    }

    //Optimized approach : time complexity: O(n+m)
    //https://www.youtube.com/watch?v=NoLIX84wLVc
    //pointer approach
   /* public static int countNegatives(int[][] grid) {
        int r = grid.length - 1;
        int c = 0;
        int neg = 0;

        while(r >= 0 && c < grid[0].length){
            if(grid[r][c] < 0){
                r--;
                neg = neg + (grid[0].length - c);
            } else {
                c++;
            }
        }
        return neg;
    }*/

    //Binary Search
    //time complexity: O(m*log(n))
    //2nd best
    //https://www.youtube.com/watch?v=64N-jHG595Q
    public static int countNegatives(int[][] grid) {
        int count = 0;
        for (int[] arr : grid) {
            count = count + findNegNumbersUsingBS(arr);
        }
        return count;
    }

    private static int findNegNumbersUsingBS(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int index = 0;

        if(arr[start] < 0){
            return arr.length;
        }
        if(arr[end] >= 0){
            return 0;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] < 0){
                index = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr.length - index;
    }

   /* //Brute force : Time complexity: O(n*m)
    //Did it myself
    public int countNegatives(int[][] grid) {
        int neg = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j=0; j< grid[0].length; j++){
                if(grid[i][j] < 0){
                    neg++;
                }
            }
        }
        return neg;
    }*/
}
