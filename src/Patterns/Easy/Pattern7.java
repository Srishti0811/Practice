package Patterns.Easy;
/*

*****
 ****
  ***
   **
    *
*/

public class Pattern7 {
    public static void main(String[] args) {
        pattern7(10);
    }

    public static void pattern7(int n){
        for (int i = 0; i < n; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int c = 0; c < n-i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
