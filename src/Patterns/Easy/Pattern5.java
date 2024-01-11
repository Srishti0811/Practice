package Patterns.Easy;

//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(10);
    }

    public static void pattern5(int n){
        for (int r = 0; r < 2 * n; r++) {
            int totalCol = r > n ? 2*n - r : r;
            for (int c = 0; c < totalCol; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
        
}
