package Arrays.Easy;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class FindNumberswithEvenNumberofDigits1295_16 {
    public static void main(String[] args) {
       // int[] nums = {12,345,2,6,7896};
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    public static int findNumbers(int[] nums) {
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            int count =  0;
            while(nums[i] > 0){
                count++;
                nums[i] = nums[i]/10;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
}
