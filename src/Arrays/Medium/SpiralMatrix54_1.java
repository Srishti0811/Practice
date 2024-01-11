package Arrays.Medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/spiral-matrix/
//youtube.com/watch?v=3joo9yAZVh8
public class SpiralMatrix54_1 {
    public static void main(String[] args) {
        int[][] matrix =   {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();

        if(matrix.length == 0){
            return arr;
        }

        int rowBegin = 0;
        int rowEnd = matrix.length - 1;
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                arr.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                arr.add(matrix[i][colEnd]);
            }
            colEnd--;

            if(rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    arr.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }

            if(colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    arr.add(matrix[i][colBegin]);
                }
                colBegin++;
            }
        }
        return arr;
    }
}
