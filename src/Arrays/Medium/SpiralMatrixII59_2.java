package Arrays.Medium;

//https://leetcode.com/problems/spiral-matrix-ii/description/
//https://www.youtube.com/watch?v=NO1zLdOwgR0

import java.util.Arrays;

public class SpiralMatrixII59_2 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(3)));
    }

    public static int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int count = 1;

        int rowBegin = 0;
        int rowEnd = n - 1;
        int colBegin = 0;
        int colEnd = n - 1;

        while(rowBegin <= rowEnd && colBegin <= colEnd){
            for (int i = colBegin; i <= colEnd; i++) {
                arr[rowBegin][i] = count;
                count++;
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                arr[i][colEnd] = count;
                count++;
            }
            colEnd--;

            if(rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    arr[rowEnd][i] = count;
                    count++;
                }
                rowEnd--;
            }

            if(colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    arr[i][colBegin] = count;
                    count++;
                }
                colBegin++;
            }
        }
        return arr;
    }
}
