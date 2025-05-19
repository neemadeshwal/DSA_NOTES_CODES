package Search.LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] nums={18,15,-9,3,13,10};

        System.out.println(range(nums, 1, 4, 13));
    }

    public static int range(int[]nums,int start,int end,int target){
        if(nums.length==0) return -1;

        for(int i=start;i<=end;i++){
            if(nums[i]==target) return i;
        }

        return -1;
    }
}
