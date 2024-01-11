package Arrays.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class CreateTargetArrayintheGivenOrder1389_9 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l1.add(index[i], nums[i]);
        }
        int[] arr =new int[l1.size()];

        for(int i=0;i<nums.length;i++){
            arr[i]=l1.get(i);
        }
        return arr;
    }

    //OR

    //Sol: https://www.youtube.com/watch?v=XqKHMVzy0YM
    /*public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        for (int i = 0; i < index.length; i++) {
            for(int j = target.length-1; j > index[i]; j--){
                target[j] = target[j-1];
            }
            target[index[i]] = nums[i];
        }
        return target;
    }*/
}
