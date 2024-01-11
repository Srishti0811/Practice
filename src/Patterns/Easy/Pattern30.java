package Patterns.Easy;

//                1
//              2 1 2
//            3 2 1 2 3
//          4 3 2 1 2 3 4
//        5 4 3 2 1 2 3 4 5

import java.util.Scanner;

public class Pattern30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern30(r);
    }

    public static void pattern30(int n){
        //int space = n-1;

        for (int row = 1; row <= n; row++) {

            //Clean space code;
            for (int spa = 0; spa < n-row; spa++) {
                System.out.print(" ");
            }
            
//            //space
//            for (int s = 1; s <= 2 * space; s++) {
//                System.out.print(" ");
//            }
//            space--;

            //col
            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }

            for (int c = 2; c <= row ; c++) {
                System.out.print(c+ " ");
            }

            System.out.println();
        }

    }
}
