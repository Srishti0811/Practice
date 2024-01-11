package Patterns.Easy;

import java.util.Scanner;

public class Pattern20 {
//             ****
//             *  *
//             *  *
//             *  *
//             ****

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        pattern20(n);
    }

    public static void pattern20(int n){
        for (int row = 0; row < n; row++) {

            if(row == 0 || row == n-1){
                for (int r = 0; r < n; r++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");

                //space
                for (int s = 1; s < n - 1; s++) {
                    System.out.print(" ");
                }

                System.out.print("*");

                System.out.println();
            }
        }
    }


}
