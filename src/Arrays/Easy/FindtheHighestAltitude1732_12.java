package Arrays.Easy;
//https://leetcode.com/problems/find-the-highest-altitude/

public class FindtheHighestAltitude1732_12 {
    public static void main(String[] args) {
        int[] arr = {-5,1,5,0,-7};
        System.out.println(largestAltitude(arr));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current = current + gain[i];
            max = Math.max(current, max);
        }
        return max;
    }

}
