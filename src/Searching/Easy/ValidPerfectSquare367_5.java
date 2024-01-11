package Searching.Easy;

//https://leetcode.com/problems/valid-perfect-square/submissions/

public class ValidPerfectSquare367_5 {
    public static void main(String[] args) {
        int num = 14;
        System.out.println(isPerfectSquare(num));
    }

    public static boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        if(num == 1){
            return true;
        }

        while(start <= end){
            long mid = start + (end - start) / 2;
            long sq = mid * mid;
            if(sq == num){
                return true;
            } else if (sq > num){
                end = (int)mid - 1;
            } else {
                start = (int)mid + 1;
            }
        }
        return false;
    }
}
