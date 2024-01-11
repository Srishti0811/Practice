package Searching.Easy;

//https://leetcode.com/problems/arranging-coins/description/
//https://www.youtube.com/watch?v=QnNFgzyKDhE

public class ArrangingCoins441_6 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(3));
    }

    //Binary Search
    //n - the total number of coins
    //mid*mid+1 / 2 - if this total is equal to the total no of coins given = ans
    // if not equal - return end (mid - 1)
    //works for small nos, need long
    public static int arrangeCoins(int n) {
        long start = 0; //int start = 0;
        long end = n; //int end = n;

        while(start <= end){

            long mid = start + (end - start) / 2; //int

            if(n == (mid * (mid + 1)) / 2){
                return (int)mid;
            }
            if((mid * (mid + 1)) / 2 < n){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int)end;
    }

    //Brute force approach - did it myself
    /*public static int arrangeCoins(int n) {
        int temp = n;
        for (int i = 1; i <= n; i++) {
            temp = temp - i;
            if(temp < 0){
                return i - 1;
            }
            if(temp == 0){
                return i;
            }
        }
        return 0;
    }*/

    //Brute force approach
   /* public static int arrangeCoins(int n){
        int i = 1;
        while(n >= i){
            n = n - i;
            i++;
        }
        return i-1;
    }*/
}
