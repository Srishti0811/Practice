package Patterns.Easy;

//https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

   /*   *****
        *****
        *****
        *****
        *****  */

public class Pattern1 {
    public static void main(String[] args) {
        pattern1(10);
    }

    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
