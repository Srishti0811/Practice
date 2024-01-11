package Strings.Easy;

//https://leetcode.com/problems/shuffle-string/

public class ShuffleString1528_2 {
    public static void main(String[] args) {
        int[] indices = {4,5,6,7,0,2,1,3};
        String s = "codeleet"; //leetcode
        System.out.println(restoreString(s, indices));
    }

    public static String restoreStringSB(String s, int[] indices) {
        char[] newChar = new char[s.length()];

        int i = 0;
        int j = 0;

        char[] str = s.toCharArray();

        while(i < indices.length && j < str.length){
            newChar[indices[i]] = str[j];
            i++;
            j++;
        }

        StringBuffer sbf = new StringBuffer();

        sbf.append(newChar);

        return sbf.toString();
    }

    //OR
    //Better solution
    public static String restoreString(String s, int[] indices) {
        char arr[] = new char[indices.length];
        for(int i=0;i<indices.length;i++){
            arr[indices[i]] = s.charAt(i);
        }
        return new String(arr);
    }
}
