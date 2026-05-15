import java.util.Arrays;
import java.util.Scanner;

public class MultiDimen {

    public static void BasicsofMultiDimen() {
        // int[][] arr = new int[3][0];
        int[][] arr = {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
        };

        int[][] arr2D = {
                        {2,5,6},
                        {8,6},
                        {8,9,8,9,5}
        };
        
    }

    public static void TwoDArrayInputOutput() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); //no of arrays input

        for (int row = 0; row < arr.length; row++) {
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        // //output
        // for (int row = 0; row < arr.length; row++) {
        //     //for each col in every row
        //     for(int col = 0; col < arr[row].length; col++){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // //output
        // for (int row = 0; row < arr.length; row++) {
        //     System.out.println(Arrays.toString(arr[row]));
        // }

        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
    public static void main(String[] args) {
        BasicsofMultiDimen();
        TwoDArrayInputOutput();
    }
}
