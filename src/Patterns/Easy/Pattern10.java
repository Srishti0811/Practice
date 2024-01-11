package Patterns.Easy;
/*

            *
           * *
          * * *
         * * * *
        * * * * *
*/

public class Pattern10 {
    public static void main(String[] args) {
        pattern10(10);
    }
    public static void pattern10(int n){
        for (int r = 1; r <= n; r++) {
            for (int s = 0; s < n - r; s++) {
                System.out.print(" ");
            }
            for (int c = 0; c < r; c++) {
                System.out.print("* ");
            }
            for (int s = 0; s < n - r; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
