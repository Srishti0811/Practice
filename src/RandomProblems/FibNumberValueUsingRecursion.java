package RandomProblems;
//https://www.youtube.com/watch?v=M2uO2nMT0Bk
public class FibNumberValueUsingRecursion {
    public static void main(String[] args) {
        System.out.println(fib(6)); //8
    }

    public static int fib(int n){
        //base
        if(n < 2){
            return n;
        }

        //recursive formula
        return fib(n-1) + fib(n-2);
    }

}
