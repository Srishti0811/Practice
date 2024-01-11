package Sorting.Easy;

//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
//Myself

import java.util.Arrays;

public class AverageSalaryExcludingtheMinimumandMaximumSalary1491_23 {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }

    //Fastest
    public static double average(int[] salary) {
        double sum = 0d;
        int M = Integer.MIN_VALUE, m = Integer.MAX_VALUE;
        for (int s : salary) {
            m = Math.min(m, s);
            M = Math.max(M, s);
            sum += s;
        }
        return (sum - m - M) / (salary.length - 2);
    }


    //Myself
    public static double averageMyself(int[] salary) {
        Arrays.sort(salary);
        double sum = 0;

        for (int i = 1; i < salary.length - 1; i++) {
            sum = sum + salary[i];
        }
        return sum / (salary.length - 2);
    }
}
