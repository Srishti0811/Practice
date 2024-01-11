package Searching.Easy;

//Brute force is easy to understand
//actual is little tough: best to learn
//https://leetcode.com/problems/fair-candy-swap/description/
//https://www.youtube.com/watch?v=uFynVi19c3M
//https://www.youtube.com/watch?v=-gY42yiNLxY&t=329s
//https://leetcode.com/problems/fair-candy-swap/solutions/3442225/brute-force-binary-search-hashmap/


//  total(aliceCandies) - aliceCandies[i] + bobCandies[j]
//equals
//  total(bobCandies) - bobCandies[j] + aliceCandies[j]

import java.util.Arrays;
import java.util.HashSet;

public class FairCandySwap888_14 {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes, bobSizes)));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        HashSet<Integer> setB = new HashSet<>();
        int sumA= 0;
        int sumB = 0;

        for (int a: aliceSizes) {
            sumA = sumA + a;
        }

        for (int b: bobSizes) {
            sumB = sumB + b;
            setB.add(b);
        }

        int diff = (sumB - sumA) / 2;

        for(int a: aliceSizes){
            if(setB.contains(a + diff)){
                return new int[]{a, a+diff};
            }
        }
        return new int[0];
    }

    //Brute force: Time complexity: O(mn) and Space: O(1)
    /*public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0;
        int bobTotal = 0;
        for (int candies : aliceSizes) aliceTotal += candies;
        for (int candies : bobSizes) bobTotal += candies;

        int m = aliceSizes.length, n = bobSizes.length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if ((aliceTotal - aliceSizes[i] + bobSizes[j]) == (bobTotal - bobSizes[j] + aliceSizes[i]))
                    return new int[] { aliceSizes[i], bobSizes[j] };

        return new int[0];
    }*/
}
