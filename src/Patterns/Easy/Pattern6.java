package Patterns.Easy;
/*

      *
     **
    ***
   ****
  *****
*/

import static Patterns.Easy.Pattern5.pattern5;

public class Pattern6 {
    public static void main(String[] args) {
        pattern6(10);
    }

    public static void pattern6(int n){
        for (int r = 1; r <= n; r++) {
           int totalSpace = n - r;
            for (int s = 0; s < totalSpace; s++) {
                System.out.print(" ");
            }
            for (int c = totalSpace; c < n; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

