package Search.BinarySearch;

import java.util.Arrays;

public class BS2dArray {
    
   public static void main(String[] args) {
    
     int[][]arr={
        {10,20,30,40},
        {15,25,35,45},
        {28,29,37,49},
        {33,34,38,50}
     };
     int target=37;

     System.out.println(Arrays.toString(findTargetIn2dArray(arr, target)));

   }

   public static int[]  findTargetIn2dArray(int[][]arr,int target){
 int row=arr.length;
     int col=arr[0].length;

      for(int i=0;i<row;i++){

        for(int j=0;j<col;j++){

            if(arr[i][j]==target) return new int[]{i,j};

            else if(arr[i][j]<target) {
                row=row-1;
            }
            else{
                col=col-1;
            }
        }
      }
        return new int[]{-1,-1};

   }
   }

