package Arrays.Easy;
//https://leetcode.com/problems/transpose-matrix/
import java.util.Arrays;

public class ArrayTransposeMatrix867_17 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    }

    public static int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                arr[i][j] = matrix[j][i];
            }
        }

        return arr;
    }
}
