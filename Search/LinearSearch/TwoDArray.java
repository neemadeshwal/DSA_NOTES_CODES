package Search.LinearSearch;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] nums={
            {1,23,54,33},
            {2,44,64,32,21},
            {4,53,2,46,2}
        };

        System.out.println(Arrays.toString(findNumber(nums, 21)));
    }

    public static int[] findNumber(int[][]nums,int target){
        if(nums.length==0) return new int[]{-1,-1};

        for(int row=0;row<nums.length;row++){
            for(int col=0;col<nums[row].length;col++){
                if(nums[row][col]==target) return new int[] {row,col};
            }
        }
        return new int[] {-1,-1};

    }
}
