package Arrays.Code;

import java.util.Arrays;

public class TwoDArray {

     public static void main(String[] args) {
        System.out.println("2 D array");

        //It is array of arrays;

        /*
           to show matrix representation;

            1   2   3   4
            5   6   7   8
            9   10  11  12
        */

        //initialization

        int[][] arr=new int[5][];
        // individual size can vary

        // row=arr.length

        //col=arr[row].length

        int[][] arrS=new int[4][5];

        // here total row is 4 and total col is 5 in each row  . This is symmetrical array

        int[][] arrj=new int[5][];

        // here total row is 5 but total col in each row  can vary.This is called jagged array.

        // defining col to each row

        for(int row=0;row<arrj.length;row++){
            arrj[row]=new int[2*row];
        }

        // Output 
         System.out.println(Arrays.toString(arrj));

         // to print nested arrays
         System.out.println(Arrays.deepToString(arrj));

     }
}
