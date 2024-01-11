package Patterns.Easy;

import java.util.Scanner;

//               *       *
//             *   *   *   *
//          *        *       *

public class Pattern23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern23(r);
    }

    public static void pattern23(int n){
        int firstSpace = 2;
        int mSpace = 2;
        int count = 1;

        for (int r = 1; r <= n; r++) {
            for (int s = 1; s <= 2 * firstSpace; s++) {
                System.out.print(" ");
            }
            firstSpace--;

            System.out.print("*");

            //space under the tree
            if(r > 1){
                for (int space = 1; space <= 3 * count; space++) {
                    System.out.print(" ");
                }
                System.out.print("*");

            }

            //middle space
            if(r != n) {
                for (int s = 1; s <= 2 * mSpace + 2; s++) {
                    System.out.print(" ");
                }
                mSpace = 0;

                System.out.print("*");
            }


            if(r > 1){

                for (int space = 1; space <= 3 * count; space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
                count ++;
            }
            System.out.println();


        }
    }
}
