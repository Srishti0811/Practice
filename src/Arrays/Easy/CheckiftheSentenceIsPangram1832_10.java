package Arrays.Easy;
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
public class CheckiftheSentenceIsPangram1832_10 {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        //by default all are false
        boolean[] arr = new boolean[26];

        for(int i=0; i<sentence.length(); i++){
            arr[sentence.charAt(i) - 97] = true;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] == false){
                return false;
            }
        }
        return true;
    }
}
