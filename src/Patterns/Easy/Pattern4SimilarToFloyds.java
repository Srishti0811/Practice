package Patterns.Easy;

//         1
//         1 2
//         1 2 3
//         1 2 3 4
//         1 2 3 4 5


public class Pattern4SimilarToFloyds {
    public static void main(String[] args) {
        pattern4(10);
    }

    public static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
