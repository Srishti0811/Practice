package Patterns.Easy;
//Learn the formula
//Little similar to floyd
//https://www.youtube.com/watch?v=sXR8lNhyQfI
import java.util.Scanner;

/*              1
              1   1
            1   2   1
          1   3   3   1
        1   4   6   4   1
*/
public class Pattern16PascalsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        pattern16(r);
    }

    public static void pattern16(int n){
        int s = n;
        int number = 1;
        //Outer
        for (int i = 0; i <= n; i++) {
            //Space
            for (int space = 1; space <= s; space++) {
                System.out.print(" ");
            }

            number = 1;
            //Inner
            for (int j = 0; j <= i ; j++) {
                System.out.print(number + " ");
                number = number * (i-j)/(j+1);
            }
            s--;
            System.out.println();
        }
    }


}
