package Patterns.Easy;

//         *        *
//         **      **
//         ***    ***
//         ****  ****
//         **********
//         ****  ****
//         ***    ***
//         **      **
//         *        *

import java.util.Scanner;

public class Pattern19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern19(r);
    }

    public static void pattern19(int n){
        int countf = n - 1;
        int counts = n - 1;
        int var = 1;
        for (int row = 1; row <= 2*n; row++) {
            if(row <= n){

                //first half

                //first col(left)
                for (int c = 1; c <= row; c++) {
                    System.out.print("*");
                }

                //space
                for (int s = 1; s <= countf * 2; s++) {
                    System.out.print(" ");
                }
                countf--;

                //second col(right)
                for (int c = 1; c <= row; c++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                //second half

                //first col(left)
                for (int i = 1; i <= counts; i++) {
                    System.out.print("*");
                }

                //space
                for (int s = 1; s <= var * 2; s++) {
                    System.out.print(" ");
                }
                var++;

                //second col(right)
                for (int col = 1; col <= counts ; col++) {
                    System.out.print("*");
                }

                counts--;
                System.out.println();
            }

        }
    }

}
