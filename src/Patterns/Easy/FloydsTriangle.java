package Patterns.Easy;
//https://www.youtube.com/watch?v=KTKrwFwjpd4
//
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15
//
import java.util.Scanner;

//draw and create relations between space, row and col to get the shape

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();
        floydsTriangle(r);
        floydsTriangleWithSpaces(r);
    }

    public static void floydsTriangle(int n){
        int r = 1;
        //outer
        for (int i = 1; i < n; i++) {
            //inner
            for (int j = 1; j <= i; j++) {
                System.out.print(r + " ");
                r++;
            }
            System.out.println();
        }
    }

    //with spaces
    public static void floydsTriangleWithSpaces(int n){
        int r = 1;
        int s = n;
        //outer
        for (int i = 1; i < n; i++) {
            //Space
            for (int space = 1; space < s; space++) {
                System.out.print(" ");
            }

            //inner
            for (int j = 1; j <= i; j++) {
                System.out.print(r + " ");
                r++;
            }
            s--;
            System.out.println();
        }
    }

}
