package Patterns.Easy;

//             1      1
//             12    21
//             123  321
//             12344321

import java.util.Scanner;

public class Pattern35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern35(r);
    }

    public static void pattern35(int n){
        int space = n-2;
        for (int row = 1; row < n; row++) {
            //col
            for (int c = 1; c <= row; c++) {
                System.out.print(c);
            }

            //space
            for (int s = 2 * space; s >= 1; s--) {
                System.out.print(" ");
            }
            space--;

            //col
            for (int c = row; c >= 1; c--) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
