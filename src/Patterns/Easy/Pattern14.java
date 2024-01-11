package Patterns.Easy;

import java.util.Scanner;

/*      *********
         *     *
          *   *
           * *
            *
*/
public class Pattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int n = sc.nextInt();

        for (int row = n - 1; row >= 0 ; row--) {
            if (row == n - 1) {
                for (int stars = 1; stars < 2*n; stars++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int outerSpace = n; outerSpace > row + 1; outerSpace--) {
                    System.out.print(" ");
                }
                System.out.print("*");

                if(row != 0) {
                    for (int innerSpace = 1; innerSpace < 2 * ((row + 1) - 1); innerSpace++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.println();
            }

        }

    }


}
