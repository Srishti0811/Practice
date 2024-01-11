package Patterns.Easy;
/*

            *
           ***
          *****
         *******
        *********
*/

public class Pattern8 {
    public static void main(String[] args) {
        pattern8(10);
    }

    public static void pattern8(int n){
        for (int r = 0; r < n; r++) {
            int totalSpace = n - r + 1;
            for (int s = 0; s < totalSpace; s++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2*r + 1; star++) {
                System.out.print("*");
            }
            for (int s = 0; s < totalSpace; s++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
