package Arrays.Easy;

//https://leetcode.com/problems/maximum-population-year/
//https://www.youtube.com/watch?v=MYC7t8GSg0A
public class MaximumPopulationYear1854_19 {
    public static void main(String[] args) {
       // int[][] arr = {{1950,1961},{1960,1971},{1970,1981}};
        int[][] arr = {{1993,1999},{2000,2010}};
        System.out.println(maximumPopulation(arr));
    }

    public static int maximumPopulation(int[][] logs) {
        //2050 - 1950 = 100 - including array = 101
        int[] arr = new int[101];

        for (int i = 0; i < logs.length; i++) {
            for (int j = logs[i][0]; j < logs[i][1]; j++) {
                //as we cant make an array of size 1950
                arr[j - 1950]++;
            }
        }
        int maxValue = 0; int maxYear = 0;

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] > maxValue){
                 maxValue = arr[j];
                 maxYear = j + 1950;
            }
        }
        return maxYear;
    }

}
