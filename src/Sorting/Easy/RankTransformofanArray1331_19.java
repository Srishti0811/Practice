package Sorting.Easy;

//https://leetcode.com/problems/rank-transform-of-an-array/
//https://leetcode.com/problems/rank-transform-of-an-array/solutions/2552384/java-hashmap-array-sorting-simple-solution/

import java.util.Arrays;
import java.util.HashMap;

public class RankTransformofanArray1331_19 {
    public static void main(String[] args) {
        //int[] arr = {40,10,20,30};
        int[] arr = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));

    }

    public static int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] array=Arrays.copyOf(arr,arr.length);
        Arrays.sort(array);
        int k=1;
        for(int i=0;i<array.length;i++){
            if(!map.containsKey(array[i]))
                map.put(array[i],k++);
        }
        int[] result=new int[array.length];
        for(int i=0;i<arr.length;i++)
            result[i]=map.get(arr[i]);
        return result;
    }
}
