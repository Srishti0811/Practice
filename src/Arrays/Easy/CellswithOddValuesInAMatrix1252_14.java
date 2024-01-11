package Arrays.Easy;

//https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/description/
//Sol: https://www.youtube.com/watch?v=K_d8kSbr2mc&t=604s
public class CellswithOddValuesInAMatrix1252_14 {
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(2, 3, indices));

    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        int count = 0;

        for (int i = 0; i < indices.length; i++) {
            //when row is fix col get updated
            for (int j = 0; j < n; j++) {
                //indices 0th element of first(ri, ci) = ri
                ans[indices[i][0]][j]++;
            }
            //keep col constant update row
            for (int j = 0; j < m; j++) {
                //indices 1st element of first(ri, ci) = ci
                ans[j][indices[i][1]]++;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(ans[i][j] % 2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
