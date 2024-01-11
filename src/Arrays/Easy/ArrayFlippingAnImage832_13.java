package Arrays.Easy;
//https://leetcode.com/problems/flipping-an-image/
import java.util.Arrays;

public class ArrayFlippingAnImage832_13 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        //pointer approach
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr)));
    }

    public static int[][] flipAndInvertImage(int[][] image) {

        //reverse row
        for (int row = 0; row < image.length; row++) {
            int low = 0;
            int high = image[row].length - 1;

            while(low <= high){
                //when they are same reverse else leave
                //draw o/p and check with pointers
                //row is constant
                if(image[row][low] == image[row][high]){
                    image[row][low] = 1 - image[row][low];
                    image[row][high] = image[row][low];
                    // OR image[row][high] = 1 - image[row][high];
                }
                low++;
                high--;
            }

        }
        return image;

    }

    //OR
    /*public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            //reverse the arr
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                //swap and XOR to invert the array
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - 1 - i] ^ 1;
                row[image[0].length - 1 - i] = temp;
            }
        }
        return image;
    }*/
}
