package Patterns.Easy;
//
//           1
//          212
//         32123
//        4321234
//         32123
//          212
//           1

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern17(r);
    }

    public static void pattern17(int n){
        for (int row = 1; row <= 2 * n; row++) {
            //col
            int totalCol = row > n ? 2 * n - row : row;

            //space
            for (int s = 0; s < n - totalCol; s++) {
                System.out.print(" ");
            }

            for (int c = totalCol; c >= 1 ; c--) {
                System.out.print(c);
            }
            for (int c = 2; c <= totalCol ; c++) {
                System.out.print(c);
            }
            System.out.println();
        }


    }


    public static void pattern172(int n){
        int space = n - 1;
        int lowerCol = n - 1;
        int sp = 1;

        for (int r = 1; r < 2 * n ; r++) {
            if(r <= n) {
                //space
                for (int s = 1; s <= space; s++) {
                    System.out.print(" ");
                }
                space--;

                //col
                for (int c = r; c >= 1 ; c--) {
                    System.out.print(c);
                }

                //col
                for (int c = 2; c <= r; c++) {
                    System.out.print(c);
                }
            } else {
                //space
                for (int s = 1; s <= sp; s++) {
                    System.out.print(" ");
                }
                sp++;

                //col
                for (int c = lowerCol; c >= 1; c--) {
                    System.out.print(c);
                }

                //col
                for (int c = 2; c <= lowerCol; c++) {
                    System.out.print(c);
                }
                lowerCol--;
            }

            System.out.println();
        }

    }

}


