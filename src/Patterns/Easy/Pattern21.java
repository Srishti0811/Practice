package Patterns.Easy;

//        1
//        2  3
//        4  5  6
//        7  8  9  10
//        11 12 13 14 15

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern21(r);
    }

    public static void pattern21(int n){
        int count = 1;

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
