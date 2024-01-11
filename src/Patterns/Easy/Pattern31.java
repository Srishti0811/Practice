package Patterns.Easy;

//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4

import java.util.Scanner;

public class Pattern31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern31(r);
    }


//            0 0 0 0 0 0 0 0 0
//            0 1 1 1 1 1 1 1 0
//            0 1 2 2 2 2 2 1 0
//            0 1 2 3 3 3 2 1 0
//            0 1 2 3 4 3 2 1 0
//            0 1 2 3 3 3 2 1 0
//            0 1 2 2 2 2 2 1 0
//            0 1 1 1 1 1 1 1 0
//            0 0 0 0 0 0 0 0 0

    public static void pattern311(int n){
        n = 2 * n;
        for (int r = 0; r <= n ; r++) {
            for (int c = 0; c <= n; c++) {
                int atEveryIndex = Math.min(Math.min(r, c), Math.min(n - r, n - c));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }

    //modify to get:

//            4 4 4 4 4 4 4 4 4
//            4 3 3 3 3 3 3 3 4
//            4 3 2 2 2 2 2 3 4
//            4 3 2 1 1 1 2 3 4
//            4 3 2 1 0 1 2 3 4
//            4 3 2 1 1 1 2 3 4
//            4 3 2 2 2 2 2 3 4
//            4 3 3 3 3 3 3 3 4
//            4 4 4 4 4 4 4 4 4

    public static void pattern31(int n){
        int originalN = n;
        n = 2 * n;
        for (int r = 0; r <= n ; r++) {
            for (int c = 0; c <= n; c++) {
                int atEveryIndex = originalN - Math.min(Math.min(r, c), Math.min(n - r, n - c));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }


}
