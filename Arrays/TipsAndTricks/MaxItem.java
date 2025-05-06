package Arrays.TipsAndTricks;

public class MaxItem {
    
    public static void main(String[] args) {
         
        int[] arr={3,6,323,64,2324,64};

        System.out.println(findMax(arr));

        System.out.println(findMaxInRange(arr, 0, 1));
        
    }

    public static int findMax(int[] arr){

        if(arr.length==0) return -1;

        int max=-1;

        for(int ar:arr){
          if(ar>max){
            max=ar;
          }
        }
        return max;
    }
    
    public static int findMaxInRange(int[]arr,int start,int end){

        if(arr.length==0) return -1;

        if(start==end) return arr[end];

        int max=-1;

        for(int i=start;i<=end;i++){
        
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
