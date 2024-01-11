package Searching.Easy;

public class GuessNumberHigherOrLower374_2 {
    public static void main(String[] args) {
        System.out.println(guessNumber(2));
    }

    public static int guessNumber(int n) {
        int start = 1;
        int end = n-1;
        //int pick = 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(guess(mid) == 0){
                return mid;
            } else if (guess(mid) == -1){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    private static int guess(int num){
        return 0;
    }
}
