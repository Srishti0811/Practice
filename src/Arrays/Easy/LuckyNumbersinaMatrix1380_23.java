package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
public class LuckyNumbersinaMatrix1380_23 {
    public static void main(String[] args) {
       // int[][] mat = {{3,7,8},{9,11,13},{15,16,17}};
        int[][] mat = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println(luckyNumbers(mat));
    }

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr = new ArrayList<>();

        for (int r = 0; r < matrix.length; r++) {
            int min = 99999;
            int max = 0;
            int colIndex = 0;
            for (int col = 0; col < matrix[0].length; col++) {
                if(matrix[r][col] < min){
                    min = matrix[r][col];
                    colIndex  = col;
                }
            }

            for (int row = 0; row < matrix.length; row++) {
                if(matrix[row][colIndex] > max){
                    max = matrix[row][colIndex];
                }
            }

            if(min == max){
                arr.add(max);
            }

        }
        return arr;
    }
}
