package Patterns.Easy;
/*

                *
               * *
              *   *
             *     *
            *       *
             *     *
              *   *
               * *
                *
*/

import java.util.Scanner;

public class Pattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");

        int n = sc.nextInt();
        
        //First half of the diamond
        for (int row = 1; row <= n;  row++) {
            for (int outerSpace = n; outerSpace > row; outerSpace--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int innerSpace = 1; innerSpace < 2 * (row - 1); innerSpace++) {
                System.out.print(" ");
            }
            if (row == 1) {
                System.out.println("");
            } else {
                System.out.println("*");
            }
        }

//Second half after n
        for (int row = n - 1; row >= 1; row--) {
            for (int outerSpace = n; outerSpace > row; outerSpace--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int innerSpace = 1; innerSpace < 2 * (row - 1); innerSpace++) {
                System.out.print(" ");
            }
            if (row == 1)
                System.out.println("");
            else
                System.out.println("*");
        }
        sc.close();
    }

}
