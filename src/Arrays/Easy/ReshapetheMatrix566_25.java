package Arrays.Easy;

//https://leetcode.com/problems/reshape-the-matrix/description/
//https://www.youtube.com/watch?v=wCdNh9oThqk

import java.util.Arrays;

public class ReshapetheMatrix566_25 {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat, 1, 4)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;

        int[][] output_arr = new int[r][c];

        if(r*c != row*col){
            return mat;
        }

        int output_row = 0;
        int output_col = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                output_arr[output_row][output_col] = mat[i][j];
                output_col++;
                if(output_col == c){
                    output_col = 0;
                    output_row++;
                }
            }
        }
        return output_arr;
    }
}
