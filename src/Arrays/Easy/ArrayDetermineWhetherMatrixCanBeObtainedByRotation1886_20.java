package Arrays.Easy;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
//https://www.youtube.com/watch?v=sH1La9tCxw0
public class ArrayDetermineWhetherMatrixCanBeObtainedByRotation1886_20 {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        //to rotate 4 times
        for (int i = 0; i < 4; i++) {
            if(check(mat, target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    private static void rotate(int[][] mat) {
        int n = mat.length;

        //1. Transpose - 17
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        //2. Flip the image - 13
        int low = 0;
        int high = mat.length - 1;
        while(low <= high){
            for (int i = 0; i < mat.length; i++) {
                //keeping row constant
                int temp = mat[i][low];
                mat[i][low] = mat[i][high];
                mat[i][high] = temp;
            }
            low++;
            high--;
        }
    }

    private static boolean check(int[][] mat, int[][] target) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
