package Arrays.Easy;
//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth1672_4 {
    public static void main(String[] args) {
       // int[][] accounts = {{1,2,3},{3,2,1}};
        int[][] accounts = {{1,5},{7,3},{3,5}};
        maximumWealth(accounts);
    }

    public static int maximumWealth(int[][] accounts) {
        int init = 0, customer = 0;
        for (int r = 0; r < accounts.length; r++) {
            int sum = 0;
            for (int c = 0; c < accounts[r].length; c++) {
                sum = sum + accounts[r][c];
            }
            if(sum > init) {
                init = sum;
                customer = r + 1;
            }
        }
        System.out.println("Customer: " + customer + " Sum: " + init);
        return init;
    }
}
