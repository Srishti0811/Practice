package Patterns.Easy;

import java.util.Scanner;

//        E D C B A
//        D C B A
//        C B A
//        B A
//        A

public class Pattern34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern34(r);
    }

    public static void pattern34(int n){
        int c = n;
        int alp = 64;
        for (int row = 1; row <= n; row++) {
            for (int col = c; col >= 1; col--) {
                System.out.print((char) (alp + col) + " ");
            }
            c--;
            System.out.println();
        }
    }
}
