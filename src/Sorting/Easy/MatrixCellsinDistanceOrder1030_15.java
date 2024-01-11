package Sorting.Easy;

//Difficult to understand - bfs should be used for better understanding
//https://leetcode.com/problems/matrix-cells-in-distance-order/
//https://www.youtube.com/watch?v=_b_cEz-Pa2U

import java.util.Arrays;

public class MatrixCellsinDistanceOrder1030_15 {
    public static void main(String[] args) {
        int rows = 2;
        int cols = 3;
        int rCenter = 1;
        int cCenter = 2;
        System.out.println(Arrays.deepToString(allCellsDistOrder(rows,cols,rCenter,cCenter)));
    }

    public static int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] ans = new int[rows*cols][2]; //making a 2D array inside a array.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int boxNo = i*cols + j;
                ans[boxNo][0] = i;
                ans[boxNo][1] = j;
            }
        }

        Arrays.sort(ans, (a,b)->{
            int d1 = Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter);
            int d2 = Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter);

            return d1 - d2;
        });

        return ans;
    }
}
