package Arrays.Code;

import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        System.out.println("-----------Arrays------------");

        // declaring array which is done during compile time.
          int[] nums;

          //initializing array which occurs during run time.

          nums=new int[10];

          // or we can do this together

          int[] nums2=new int[5];


          // to add an element at particular index 
          nums2[0]=5;
          System.out.println(nums2[0]); //Output=5


          // to replace an element 
          nums2[0]=10;

          System.out.println(nums2[0]); // Output=10

          // adding all together;

          Scanner scanner=new Scanner(System.in);

          System.out.println("Enter 5 integers");
          // input five integers
          for(int i=0;i<nums2.length;i++){
            nums2[i]=scanner.nextInt();
          }

          //Print the array
          for(int i=0;i<nums2.length;i++){
            System.out.print(nums2[i]+" ");
          }

          scanner.close();


          System.out.println();

          // enhanced for loop to print or any other modification;

          for(int num:nums2){
            System.out.print(num+" ");
          }

          //Easiest way to print is through converting it tostring

          System.out.println();

          System.out.println(Arrays.toString(nums2));


    }
}