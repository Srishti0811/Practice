package Recursion;

//https://www.youtube.com/watch?v=M2uO2nMT0Bk&list=PL9gnSGHSqcnp39cTyB1dTZ2pJ04Xmdrod
public class BinarySearchUsingRec {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 8, 65, 90};
        int target = 2;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));
    }

    public static int binarySearch(int[] arr, int target, int s, int e){
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;

        if(arr[m] == target){
            return m;
        }

        if(arr[m] > target){
            return binarySearch(arr, target, s, m - 1);
        }
        return binarySearch(arr, target, m+1, e);
    }
}
