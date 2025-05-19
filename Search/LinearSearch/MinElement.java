package Search.LinearSearch;

public class MinElement {
    public static void main(String[] args) {
        int[] nums={18,15,-9,3,13,10};

        System.out.println(MinElementFn(nums));
    }

    public static int MinElementFn(int[]nums){
        int min=Integer.MAX_VALUE;
        if(nums.length==0) return min;

        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }
        }   
        return  min;
    }
}
