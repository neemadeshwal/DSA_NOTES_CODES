package Arrays.TipsAndTricks;

import java.util.Arrays;

public class ReverseArray {
    
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(arr));

        reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverse(int[]arr){

        if(arr.length<2) return ;

        for(int i=0;i<arr.length/2;i++){

            
            int end=arr.length-1-i;
            int start=i;

            int temp=arr[end];
             arr[end]=arr[start];
             arr[start]=temp;
        }
    }
}
