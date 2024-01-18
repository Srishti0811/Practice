package RandomProblems;

//Sum of first 2 nos is equal to the third no.
//0, 1, 1, 2, 3, 5, 8, 13, 21..
public class FibonacciSeries {

    public static void main(String[] args) {
        fib(7);
    }

    public static void fib(int n){
        int first = 0;
        int second = 1;

        System.out.println(first);
        System.out.println(second);

        for (int i = 2; i <= n; i++) {
            int third = first + second;
            System.out.println(third);
            first = second;
            second = third;
        }
    }

}
