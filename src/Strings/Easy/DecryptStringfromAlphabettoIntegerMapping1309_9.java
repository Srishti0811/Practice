package Strings.Easy;

//https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/description/
//https://youtube.com/watch?v=czufxGQlC3o

public class DecryptStringfromAlphabettoIntegerMapping1309_9 {
    public static void main(String[] args) {
        String s = "10#11#12";
        System.out.println(freqAlphabets(s));
    }

    public static String freqAlphabets(String s) {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while(i < s.length()){
            if((i+2) < s.length() && s.charAt(i+2) == '#'){
                String sub = s.substring(i, i+2);
                int num = Integer.parseInt(sub);
                char ch = (char) (num + 96); // 96 = a till 123 = z
                sb.append(ch);
                i = i + 3;
            } else { //if third char is not # convert each char
                char ch = s.charAt(i);
                sb.append((char)(ch + 48)); // 0 = 48 and 9 = 57
                i++;
            }
        }
        return sb.toString();
    }
}
