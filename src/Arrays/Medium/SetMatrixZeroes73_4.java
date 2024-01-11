package Arrays.Medium;

//https://leetcode.com/problems/set-matrix-zeroes/description/
//https://www.youtube.com/watch?v=HliRLQ_A81o

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeroes73_4 {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
    }

    public static void setZeroes(int[][] matrix) {
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int i = 0; i < row.size(); i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[row.get(i)][j] = 0;
            }
        }

        for (int i = 0; i < col.size(); i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][col.get(i)] = 0;
            }
        }

        System.out.println(Arrays.deepToString(matrix));
    }
}
