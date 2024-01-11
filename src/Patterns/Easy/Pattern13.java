package Patterns.Easy;
/*

            *
           * *
          *   *
         *     *
        *********
*/

public class Pattern13 {
    public static void main(String[] args) {
        pattern13(10);
    }

    public static void pattern13(int n){
        int count = 1;
        for (int r = 1; r < n; r++) {
            for (int s = 0; s < n-r; s++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(r!=1) {
                for (int s = 0; s < 2* count - 1; s++) {
                    System.out.print(" ");
                }
                count++;
                System.out.print("*");
            }
            for (int s = 0; s < n-r; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }

    }
}
