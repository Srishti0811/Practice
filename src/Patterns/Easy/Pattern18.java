package Patterns.Easy;

//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern18(r);
    }

    public static void pattern18(int n) {
        int r = 1;
        int count = n - 1;

        for (int row = 0; row < 2 * n; row++) {
            if (row < n) {
                //first col
                for (int col = 1; col <= n - row; col++) {
                    System.out.print("*");
                }

                //space
                for (int s = 0; s < 2 * row; s++) {
                    System.out.print(" ");
                }


                //second half
                for (int col = n - row + 1; col > 1; col--) {
                    System.out.print("*");
                }
                System.out.println();

            } else {

                //first col
                for (int col = 1; col <= r ; col++) {
                    System.out.print("*");
                }
                //space
                for (int s = 0; s < count * 2; s++) {
                    System.out.print(" ");
                }
                count--;

                //second half
                for (int col = 1; col <= r ; col++) {
                    System.out.print("*");
                }

                r++;
                System.out.println();
        }

        }
    }

}
