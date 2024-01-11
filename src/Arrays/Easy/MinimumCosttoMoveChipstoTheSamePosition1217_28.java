package Arrays.Easy;

//https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
//https://www.youtube.com/watch?v=ZygLFIowYPk

public class MinimumCosttoMoveChipstoTheSamePosition1217_28 {
    public static void main(String[] args) {
        int[] arr = {2,2,2,3,3};
        System.out.println(minCostToMoveChips(arr));
    }

    public static int minCostToMoveChips(int[] position) {
        //we need to move all coins in odd position to 1 - cost = 0
        //all coins in even position to 2 as that will cost 0
        //then decide which is smaller and return as moving them would cost 1 each.

        int chipsInOdd = 0;
        int chipsInEven = 0;

        for (int i = 0; i < position.length; i++) {
            if(position[i] % 2 == 0){
                chipsInEven++;
            } else {
                chipsInOdd++;
            }
        }
        return Math.min(chipsInEven, chipsInOdd);
    }
}
