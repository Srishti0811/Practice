package Sorting.Easy;

//https://leetcode.com/problems/majority-element/description/
//https://www.youtube.com/watch?v=2q4nrvAXfI4
//https://www.youtube.com/watch?v=M1IL4hz0QrE
//Time complexity: O(n)
//Space: O(1)

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement169_2 {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElementUsingHM(nums));
    }

    public static int majorityElement(int[] nums) {
        //This is an algo trick - Mores voting algo
        int candidate = 0;
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (counter == 0) {
                candidate = nums[i];
            }
            if (nums[i] == candidate) {
                counter++;
            } else {
                counter--;
            }
        }
        return candidate;
    }

    //Using hashmap
    public static int majorityElementUsingHM(int[] nums) {
        int result=0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x:nums){
            if(!map.containsKey(x)){
                map.put(x,1);
            }
            else{
                map.put(x,map.get(x)+1);
            }
        }
        for(int x:map.keySet()){
            if(map.get(x)>nums.length/2)
                result=x;
        }
        return result;
    }

   /* //or hashmap:
    public static int majorityElementUsingHM(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int maxfrequency = 1;
        int maxElement = nums[0];

        for (int i = 0; i < nums.length; i++) {
            boolean keyExists = hm.containsKey(nums[i]);
            if(keyExists){
                int existingFreq = hm.get(nums[i]);
                hm.put(nums[i], existingFreq + 1);
            } else {
                hm.put(nums[i], 1);
            }

            int freq = hm.get(nums[i]);
            if(freq > maxfrequency){
                maxfrequency = freq;
                maxElement = nums[i];
            }
        }
        return maxElement;
    }*/

    //Using Sort
    /*if majority elements is more then n/2 so it will definetly
    come in middle of the arrray so we simply returned the
    middle elements of the array.*/
    public static int majorityElementUsingSort(int[] nums) {
        int n = nums.length;
        int mid = n/2;
        Arrays.sort(nums);
        return nums[mid];
    }


}


