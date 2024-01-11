package Patterns.Easy;


//                *****
//               *   *
//              *   *
//             *   *
//            *****

import java.util.Scanner;

public class Pattern25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern25(r);
    }

    public static void pattern25(int n){
        int count = n;
        for (int row = 0; row < n; row++) {

            //space
            for (int s = 1; s <= count; s++) {
                System.out.print(" ");
            }
            count--;

            if(row != 0 && row != n-1){
                System.out.print("*");

                //space
                for (int s = 1; s < n; s++) {
                    System.out.print(" ");
                }

                System.out.print("*");
                } else {
                    for (int i = 0; i < n; i++) {
                        System.out.print("*");
                    }
                }
            System.out.println();
            }
        }

}
