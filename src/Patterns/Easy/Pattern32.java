package Patterns.Easy;

//         E
//         D E
//         C D E
//         B C D E
//         A B C D E

import java.util.Scanner;

public class Pattern32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern32(r);
    }

    public static void pattern32(int n) {
        int ch = 65 + n;
        for (int row = 1; row <= n; row++) {
            int r = row;
            //col
            for (int j = 1; j <= row; j++) {
                System.out.print((char) (ch - r) + " ");
                r--;
            }
            System.out.println();
        }
    }

}

