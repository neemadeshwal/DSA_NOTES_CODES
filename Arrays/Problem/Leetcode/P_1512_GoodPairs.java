package Arrays.Problem.Leetcode;

public class P_1512_GoodPairs {
    
    public static void main(String[] args) {
        
        int[] nums={1,2,3,1,1,3};

        //Problem
        // Given an array of integers nums, return the number of good pairs.

        // A pair (i, j) is called good if nums[i] == nums[j] and i < j.

            // 1 <= nums.length <= 100
            // 1 <= nums[i] <= 100

        //-----------Ans----------

        //It can be solved using nested loop and checking each value with all the other values.
        // But this will not be optimal as it will increase the time complexity-o(n^2) and space complexity of O(1)

        
       //------Optimal solution-----
       //Since the constraint is that the values can be max 100 so we can try new appraoch.

       //Mathematical explantion of that approach

       // Suppose x number appears k times

       // When we see it k+1 times it can pair with each of the previous k times.So you add k in total.

       //eg-- 1st occurence =0 (it pairs with none),
       //  -- 2nd occurence =1 (it pairs with 1 ),
       //  -- 3rd occurence =2 (it pairs with 2 ), and so on .....

       // total = 0+1+2+3+.........+(k-1)=k(k-1)/2  


       // solution-------------------------
       
       // create new array
       int[] arr=new int[101];

       int result=0;

       for(int num:nums){
         // this addition is like adding previous val with new val which is always be (k-1) 
         //for k number as first one start with zero.
         // 0+1+2.......
          result=arr[num];
          arr[num]++;
       }
      System.out.println(result);
    }
}
