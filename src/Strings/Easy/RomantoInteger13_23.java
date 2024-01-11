package Strings.Easy;

//https://leetcode.com/problems/roman-to-integer/description/
//https://leetcode.com/problems/roman-to-integer/solutions/3651672/best-method-c-java-python-beginner-friendly/

import java.util.HashMap;

public class RomantoInteger13_23 {
    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        HashMap<Character, Integer> m = new HashMap<>();

        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if(i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i+1))){
                ans = ans - m.get(s.charAt(i));
            } else {
                ans = ans + m.get(s.charAt(i));
            }
        }

        return ans;
    }
}
