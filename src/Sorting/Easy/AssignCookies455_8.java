package Sorting.Easy;

//https://leetcode.com/problems/assign-cookies/
//https://www.youtube.com/watch?v=EX2jEKJnzw4
import java.util.Arrays;

public class AssignCookies455_8 {
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(findContentChildren(g, s));

    }

    //O(nlogn)
    //sort and 2 pointer approach
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int a_pointer= 0;
        int b_pointer = 0;

        while(a_pointer < g.length && b_pointer < s.length){
            if(g[a_pointer] <= s[b_pointer]){ // we are good
                a_pointer++;
                b_pointer++;
            } else {
                b_pointer++;
            }
        }
        return a_pointer;
    }
}
