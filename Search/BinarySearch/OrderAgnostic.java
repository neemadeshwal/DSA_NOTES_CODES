package Search.BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] num1={1,2,3,4,5,6};
        int[] num2={6,5,4,3,2,1};

        int target=2;

        System.out.println(findTarget(num2, target));
        System.out.println(findTarget(num1, target));


    }
    public static int findTarget(int[]nums,int target){
        
        int start=0;
        int end=nums.length-1;

        boolean isAscending=nums[start]<nums[end];

        while(start<=end){

            int mid=start+(end-start)/2;

            if(nums[mid]==target) return mid;

            else if(nums[mid]>target){
                if(isAscending){
                  end=mid-1;
                }
                else{
                 start=mid+1;
                }
            }

            else{
                if(isAscending){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            
        }
        return -1;

    }
}
