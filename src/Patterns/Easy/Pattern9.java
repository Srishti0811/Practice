package Patterns.Easy;
/*

    *********
     *******
      *****
       ***
        *
*/

public class Pattern9 {
    public static void main(String[] args) {
        pattern9(10);
    }

    public static void pattern9(int n){
        int count = 1;
        for (int r = 0; r < n; r++) {
            for (int s = 0; s < r; s++) {
                System.out.print(" ");
            }
            for (int c = 0; c < 2 * n - count - r; c++) {
                System.out.print("*");
            }
            count++;
            for (int s = 0; s < r; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
