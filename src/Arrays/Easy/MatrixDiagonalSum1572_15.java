package Arrays.Easy;
//https://leetcode.com/problems/matrix-diagonal-sum/
public class MatrixDiagonalSum1572_15 {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            sum = sum + mat[i][i] + mat[i][mat.length - 1 - i];
        }

        if(mat.length % 2 == 0){
            return sum;
        } else {
            return sum - mat[n/2][n/2];
        }
    }


}
