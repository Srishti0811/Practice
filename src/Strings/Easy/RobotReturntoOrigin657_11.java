package Strings.Easy;

//https://leetcode.com/problems/robot-return-to-origin/description/

public class RobotReturntoOrigin657_11 {
    public static void main(String[] args) {
        String moves = "LL";

        System.out.println(judgeCircle(moves));
    }

    public static boolean judgeCircle(String moves) {
        int countV = 0;
        int countH = 0;
        for(char c : moves.toCharArray()){
            if(c == 'U'){
                countH++;
            }
            if(c == 'D'){
                countH--;
            }
            if(c == 'L'){
                countV++;
            }
            if(c == 'R'){
                countV--;
            }
        }

        if(countV == 0 && countH == 0){
            return true;
        }
        return false;
    }
}
