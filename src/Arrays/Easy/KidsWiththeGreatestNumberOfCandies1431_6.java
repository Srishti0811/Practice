package Arrays.Easy;
//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberOfCandies1431_6 {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            boolean flag = true;
            for (int j = 0; j < candies.length; j++) {
                if(candies[i] + extraCandies < candies[j]){
                    flag = false;
                    break;
                }
            }
            ans.add(flag);
        }
        return ans;
    }


}
