package Search.BinarySearch;

public class code {

     public static void main(String[] args) {
        int[] nums={1,2,3,4,56,78,99,132,234};
        int target=56;

        System.out.println(binarySearchFn(nums, target));
        
     }

     public static int binarySearchFn(int[] nums,int target){
        if(nums.length==0) return -1;

       int start=0;
       int end=nums.length-1;

       while(start<=end){

        // int mid=(start+end)/2;// might be possible that start+end>exceed range of error

        int mid=start+( end-start)/2;

         if(nums[mid]==target) return mid;

         else if(nums[mid]>target) {
            end=mid-1;
         }
         else{
            start=mid+1;
         }
       }

       return -1;
     }
}

