package Strings.Easy;

//https://leetcode.com/problems/excel-sheet-column-title/description/
//https://www.youtube.com/watch?v=Q01FiVtwc8A

public class ExcelSheetColumnTitle168_13 {
    public static void main(String[] args) {
        int col = 28;
        System.out.println(convertToTitle(col));
    }
    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();

        while(n>0){
            int rem = (n - 1) % 26; //don't know why n-1
            result.append((char) (rem + 'A'));
            n = (n-1) / 26;
        }

        return result.reverse().toString();
    }
}
