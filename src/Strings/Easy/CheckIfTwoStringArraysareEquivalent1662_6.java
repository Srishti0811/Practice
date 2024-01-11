package Strings.Easy;

//https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

public class CheckIfTwoStringArraysareEquivalent1662_6 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};

        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer sb1 = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();

        for(String s: word1){
            sb1.append(s);
        }

        for(String s: word2){
            sb2.append(s);
        }

        if(sb1.toString().equals(sb2.toString())){
            return true;
        }
        return false;

        //OR one line:
        //return(String.join("", word1).equals(String.join("", word2)));
    }
}
