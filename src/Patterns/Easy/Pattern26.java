package Patterns.Easy;
//
//        1 1 1 1 1 1
//        2 2 2 2 2
//        3 3 3 3
//        4 4 4
//        5 5
//        6

import java.util.Scanner;

public class Pattern26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern26(r);
    }

    public static void pattern26(int n){
        int count = 1;
        int column = n;

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= column; col++) {
                System.out.print(count + " ");
            }
            column--;
            count++;
            System.out.println();
        }

    }
}
