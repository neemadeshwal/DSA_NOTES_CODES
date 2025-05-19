package Search.LinearSearch;

public class Code {
    public static void main(String[] args) {
        
        int [] nums={1,2,3,4,5,6,7,8};

        //by index
        System.out.println(linearSearchIndex(nums, 7));

        //by number
        System.out.println(linearSearchNumber(nums, 3));

        //by boolean
        System.out.println(linearSearchBoolean(nums, 0));

        String str="neema";

        System.out.println(linearSearchOfString(str,'a'));

    }

    public static int linearSearchIndex(int[] nums,int target){
        if(nums.length==0) return -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) return i;
        }
        // if the target not found
        return -1;
    }

    public static int linearSearchNumber(int[]nums,int target){
        if(nums.length==0) return Integer.MIN_VALUE;

        for(int num:nums){
            if(num==target) return num;
        }

        return Integer.MIN_VALUE;
    }

    public static boolean linearSearchBoolean(int[]nums,int target){
        if(nums.length==0) return false;

        for(int num:nums){
            if(num==target) return true;
        }
        return false;
    }

    public static int linearSearchOfString(String str,char ch){

        if(str.length()==0) return -1;

        for(int i=0;i<str.length();i++){

            if(str.charAt(i)==ch) return i;
        }

        return -1;
    }
}
