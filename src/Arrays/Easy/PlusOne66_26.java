package Arrays.Easy;


import java.util.Arrays;

//https://leetcode.com/problems/plus-one/submissions/


public class PlusOne66_26 {
    public static void main(String[] args) {
       // int[] arr = {1,2,3};
        int[] arr = {1,9,9,9};
        System.out.println((Arrays.toString(plusOne(arr))));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        int[] arr = new int[digits.length+1];
        arr[0] = 1;
        return arr;
    }


    //Alternative but returns an arraylist - similar to problem 18
   /* public static List<Integer> plusOne(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();

        int i = digits.length - 1;
        int j = 1;

        while(i >= 0 || j > 0){
            if(i >= 0) {
                arr.add((digits[i] + j) % 10);
                j = (digits[i] + j) / 10;
                i--;
            } else {
                arr.add(j%10);
                j = j/10;
            }
        }
        Collections.reverse(arr);
        return arr;
    }
*/
}
