package Search.BinarySearch;
public class PositionInfiniteNumber {
    
    public static void main(String[] args) {
        int[] nums={2, 5, 7, 9};

        int target=3;
        System.out.println(findTarget(nums, target));
    }

    public static int findTarget(int[]nums,int target){

        int start=0;
        int end=1;
        int val=nums[0];

        while(val<target){
            start=end;
            end
        }

        while(start<end){

            if(nums[end]<target){
                start=end;
                end=end+1;
            }
            else{
            int mid=start+(end-start)/2;

            if(target==nums[mid]){
                return mid;

            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            }
            
        }
        return -1;
    }
}
