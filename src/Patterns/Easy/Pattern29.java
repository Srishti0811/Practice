package Patterns.Easy;


//               *        *
//               **      **
//               ***    ***
//               ****  ****
//               **********
//               ****  ****
//               ***    ***
//               **      **
//               *        *

import java.util.Scanner;

public class Pattern29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern29(r);
    }

    public static void pattern29(int n){
        int count = 1;
        int space = n - 1;
        for (int row = 1; row <= 2*n ; row++) {

            //First half
            for (int star = 1; star <= count; star++) {
                System.out.print("*");
            }


            //space
            for (int s = 1; s <= space * 2; s++) {
                System.out.print(" ");
            }

            //second half
            for (int star = 1; star <= count; star++) {
                System.out.print("*");
            }

            if(row < n) {
                count++;
                space--;
            } else {
                count--;
                space++;
            }
            System.out.println();
        }

    }
}
