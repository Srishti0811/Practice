package Patterns.Easy;
/*

     * * * * *
      * * * *
       * * *
        * *
         *
*/

public class Pattern11 {
    public static void main(String[] args) {
        pattern12(10);
    }

    public static void pattern12(int n){
        for (int r = 0; r < n; r++) {
            for (int s = 0; s < r; s++) {
                System.out.print(" ");
            }
            for (int s = 0; s < n - r; s++) {
                System.out.print("* ");
            }
            for (int s = 0; s < r; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
