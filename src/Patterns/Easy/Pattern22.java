package Patterns.Easy;
//
//         1
//         0 1
//         1 0 1
//         0 1 0 1
//         1 0 1 0 1

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern22(r);
    }

    public static void pattern22(int n){
        int count = 1;
        for (int r = 1; r <= n; r++) {
            count = r % 2 == 0? 0 : 1;
            for (int c = 1; c <= r; c++) {
                System.out.print(count + " ");
                count = count == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}
