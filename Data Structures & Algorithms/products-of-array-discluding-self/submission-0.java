class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefixProductStart [] = new int[nums.length];
          int prefixProductEnd [] = new int[nums.length];

          int result[] = new int[nums.length];


          //filling prefix product start
          prefixProductStart[0] = nums[0];
          for(int i=1; i<nums.length; i++){
            prefixProductStart[i] = prefixProductStart[i-1]*nums[i];
          }

          //filling prefixproductend
          prefixProductEnd[n-1] = nums[n-1];
          for(int i=n-2; i>=0; i--){
            prefixProductEnd[i] = prefixProductEnd[i+1]*nums[i];
          }

          result[0] = prefixProductEnd[1];
          result[n-1] = prefixProductStart[n-2];

         for(int i=1; i<n-1; i++){
            result[i] = prefixProductStart[i-1]*prefixProductEnd[i+1];
         }
        return result;
    }
}  
