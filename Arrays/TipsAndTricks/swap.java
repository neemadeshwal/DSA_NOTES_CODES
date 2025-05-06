package Arrays.TipsAndTricks;

import java.util.Arrays;

public class swap {
    
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(arr));
        
        // this will swap the value of  index 1 to index 3 and vice versa

        // Note- since we are passing the array so the reference is passed in the parameter 
        // we dont have to return anything since the changes made inside the array will reflect to original array
        // as both are pointing to the same object

        swapFn(arr,1,3);

        System.out.println(Arrays.toString(arr));


    }

    public static void swapFn(int[] arr,int i1,int i2){

        // edge case to avoid error
        if(i1<0||i2<0||i1>=arr.length||i2>=arr.length) return ;

        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
        

    }
}
