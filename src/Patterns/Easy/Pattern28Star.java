package Patterns.Easy;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md
//https://www.youtube.com/watch?v=lsOOs5J8ycw

import java.util.Scanner;
//
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
//
public class Pattern28Star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern28(r);
    }

    public static void pattern28(int n){
        int count = 1;

        for (int row = 0; row < 2*n; row++) {
            int totalColInRows = row < n ? row + 1: 2 * n - row - 1;

            int noOfSpacesInRow = row < n ? n - 1 - row : count++;
            // or int noOfSpacesInRow = n - totalColInRows; - use this

            for (int space = 1; space <= noOfSpacesInRow; space++) {
                System.out.print(" ");
            }

           // int c = row < n ? row + 1: 2 * n - row - 1;

            for (int col = 1; col <= totalColInRows; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
