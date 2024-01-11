package Sorting.Easy;

import java.util.*;

//Little difficult to understand - learn streams
//https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
//https://www.youtube.com/watch?v=IAUfxFDnPOc
//https://leetcode.com/problems/sort-array-by-increasing-frequency/solutions/2622771/java-hashmap-sorting-explained/

public class SortArraybyIncreasingFrequency1636_26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(frequencySort(nums)));
    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();
        for (int n : nums) {
            ans.add(n);
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }

        Collections.sort(ans, (a, b) ->
                (hm.get(a) == hm.get(b))? b - a : hm.get(a) - hm.get(b)
        );

        return ans.stream().mapToInt(i -> i).toArray(); // O(n)
    }
}
