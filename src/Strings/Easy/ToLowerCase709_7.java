package Strings.Easy;

//https://leetcode.com/problems/to-lower-case/description/

public class ToLowerCase709_7 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()){
            if (c >= 'A' && c <= 'Z' ){
                c = (char) ((int) c + 32 );
            }
            result.append(c);
        }

        return result.toString();

        //OR
        //return s.toLowerCase();
    }
}
