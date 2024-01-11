//https://leetcode.com/problems/sqrtx/
//https://www.youtube.com/watch?v=HCCj-g0Tt6Q
package Searching.Easy;

public class SquareRoot69_1 {
    public static void main(String[] args) {
        System.out.println(mySqrt(11));
    }

    public static int mySqrt(int x) {
        int start = 1;
        int end = x;

        if(x<2){
            return x;
        }

        while (start <= end){
            int mid = start + (end - start) / 2;
            if(mid * mid == x) {
                return mid;
            } else if (mid > x/mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return end; //or start - 1;
    }
}
