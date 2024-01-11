package Patterns.Easy;

//        *        *
//        **      **
//        * *    * *
//        *  *  *  *
//        *   **   *
//        *   **   *
//        *  *  *  *
//        * *    * *
//        **      **
//        *        *

import java.util.Scanner;

public class Pattern24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern24(r);
    }

    public static void pattern24(int n){
        int innerSpace = n - 1;
        int outerSpace = 0;

        for (int row = 1; row <= 2*n; row++) {
            if(row <= n) {
                //first star
                System.out.print("*");

                //outer space left
                if (row != 1 && row != 2 * n) {
                    for (int outerSpaceleft = 0; outerSpaceleft < outerSpace; outerSpaceleft++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                //inner space
                for (int iSpace = 1; iSpace <= 2 * innerSpace; iSpace++) {
                    System.out.print(" ");
                }
                innerSpace--;

                System.out.print("*");

                //outerSpace Right - same as above left
                if (row != 1 && row != 2*n){
                    for (int outerSpaceleft = 0; outerSpaceleft < outerSpace; outerSpaceleft++) {
                        System.out.print(" ");
                    }
                    outerSpace++;
                    System.out.print("*");
                }

                System.out.println();
            } else {
                System.out.print("*");

                //outer loop left
                if (row != 1 && row != 2 * n) {
                    for (int outerSpaceleft = 0; outerSpaceleft < outerSpace - 1; outerSpaceleft++) {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }

                //inner loop
                for (int iSpace = 1; iSpace <= 2 * (innerSpace + 1); iSpace++) {
                    System.out.print(" ");
                }
                innerSpace++;

                System.out.print("*");

                //outerSpace Right - same as above left
                if (row != 1 && row != 2*n){
                    for (int outerSpaceleft = 0; outerSpaceleft < outerSpace - 1; outerSpaceleft++) {
                        System.out.print(" ");
                    }
                    outerSpace--;
                    System.out.print("*");
                }

                System.out.println();
            }

        }
    }
}
