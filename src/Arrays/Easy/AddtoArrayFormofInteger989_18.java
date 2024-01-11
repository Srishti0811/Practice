package Arrays.Easy;

//https://leetcode.com/problems/add-to-array-form-of-integer/description/
//https://www.youtube.com/watch?v=K0NDHD-xaGo
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger989_18 {
    public static void main(String[] args) {
        int[] nums = {2,7,4};
        System.out.println(addToArrayForm(nums, 181));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = num.length - 1;

        while(i >= 0 || k > 0){
            if(i>=0){
                arr.add((num[i]+k) % 10);
                k = (num[i]+k) / 10;
                i--;
            } else {
                arr.add(k%10);
                k=k/10;
            }
        }
        Collections.reverse(arr);
        return arr;
    }
}
