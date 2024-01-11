package Patterns.Easy;
/*
        * * * * *
         * * * *
          * * *
           * *
            *
            *
           * *
          * * *
         * * * *
        * * * * *
 */

public class Pattern12 {
    public static void main(String[] args) {
        pattern12(10);
    }

    public static void pattern12(int n){
        int count = 1;
        for (int r = 0; r < 2*n; r++) {
            int space = r < n ? r : r - (2 * count++ - 1);
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            int col = r < n ? n - r: r - n + 1;
            for (int c = 0; c < col; c++) {
                System.out.print("* ");
            }
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
