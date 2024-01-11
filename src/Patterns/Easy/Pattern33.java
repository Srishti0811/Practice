package Patterns.Easy;

//         a
//         B c
//         D e F
//         g H i J
//         k L m N o

import java.util.Scanner;

public class Pattern33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern33(r);
    }

    public static void pattern33(int n){
        int alp = 65;
        int c = 0;

        //97 for small a
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                if(c % 2 == 0){
                    System.out.print(Character.toLowerCase((char) (alp + c)) + " ");
                } else {
                    System.out.print((char) (alp + c) + " ");
                }
                c++;
            }
            System.out.println();
        }

    }

}
