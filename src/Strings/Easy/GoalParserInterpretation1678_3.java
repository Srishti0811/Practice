package Strings.Easy;

//https://leetcode.com/problems/goal-parser-interpretation/

public class GoalParserInterpretation1678_3 {
    public static void main(String[] args) {
        String command = "G()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        command =  command.replace("()", "o");
        command =  command.replace("(al)", "al");
        return command;

        //OR
        //return command.replace("()","o").replace("(al)","al");
    }

    public static String interpretSB(String command) {
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                sb.append("G");
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                sb.append("o");
            }
            if(command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                sb.append("al");
            }
        }
        return sb.toString();
    }
}
