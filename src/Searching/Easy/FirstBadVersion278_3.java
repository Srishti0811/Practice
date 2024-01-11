package Searching.Easy;

//https://www.youtube.com/watch?v=4n783kDY5n4
//https://leetcode.com/problems/first-bad-version/description/

public class FirstBadVersion278_3 {
    public static void main(String[] args) {

    }

    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while(start < end) {
            int mid = start + (end - start) / 2;

          /*  if(isBadVersion(mid)){
                end = mid;
            } else {
                start = mid + 1;
            }*/
        }
        return start;
    }
}
