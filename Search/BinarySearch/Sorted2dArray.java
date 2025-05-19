package Search.BinarySearch;

import java.util.Arrays;

public class Sorted2dArray {
    
    public static void main(String[] args) {
        
        int[][] matrix={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target=4;

       System.out.println(Arrays.toString(search(matrix, target)));
    }

    public static int[] findTarget(int[][]matrix,int row,int cStart,int cEnd,int target){

        while (cStart<=cEnd) {
            int mid=cStart+(cEnd-cStart)/2;

            if(target==matrix[row][mid]){
                return new int[]{row,mid};
            }
            else if(target>matrix[row][mid]){
                cStart=mid+1;
            }
            else{
                cEnd=mid-1;
            }
            
        }
        return new int[]{-1,-1};
    }

    public static int[] search(int[][]matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;

        if(row==1){
            return findTarget(matrix,0,0,col-1,target);
        }

        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;

        while(rStart<(rEnd-1)){

            int mid=rStart+(rEnd-rStart)/2;

            if(matrix[mid][cMid]==target) return new int[]{mid,cMid};

           else  if(matrix[mid][cMid]<target){
                rStart=mid;
            }
            else{
                rEnd=mid;
            }

        }

        if(matrix[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }

        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1,cMid};
        }

        //search in fist half

        if(target<=matrix[rStart][cMid-1]){
            return findTarget(matrix, rStart, 0, cMid-1, target);
        }
        //search in second half

        if(target>=matrix[rStart][cMid+1]&&target<=matrix[rStart][col-1]){
            return findTarget(matrix, rStart, cMid+1, col-1, target);

        }
        //search in third half

        if(target<=matrix[rStart+1][cMid-1]){
            return findTarget(matrix, rStart+1, 0, cMid-1, target);
        }
        //search in fourth half
        else{
            return findTarget(matrix, rStart+1, cMid+1, col-1, target);

        }




    }
}
