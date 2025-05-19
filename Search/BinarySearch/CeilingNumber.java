package Search.BinarySearch;

public class CeilingNumber {

     public static void main(String[] args) {
                //  0, 1, 2, 3, 4, 5, 6   
        // int[] nums={1 ,1, 4, 4, 4, 4, 10};
        int[] nums={1,1,2,5,7};
        int target=6;
        System.out.println(findCeiling(nums, target));
     }

     public static int findCeiling(int[] arr,int x){

        // int start=0;
        // int end=nums.length-1;

        // while(start<end){

        //     int mid=start+(end-start)/2;

        //      if(nums[mid]>=target){
        //         end=mid;
        //     }
        //     else{
        //         start=mid+1;
        //     }

        // }
        // return start;
    //    int start=0;
    //     int end=arr.length-1;
        
    //     while(arr[start]<x&&start<end){
    //         start++;
    //     }
        
    //     return arr[start]<x?-1:start;
     int start=0;
        int end=arr.length-1;
        
        while(arr[start]<x&&start<arr.length-1){
            int mid=start+(end-start)/2;
            
            if(arr[mid]<x){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
    
        
        return arr[start]<x?-1:start;
     }
}