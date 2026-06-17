class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int k = nums[0];
        int maxCount =0;
        int cnt =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == k-1 ) continue;
            if(nums[i] == k){
               cnt++;
               k++;
                maxCount = Math.max(cnt,maxCount);
            }else{
               
                k = nums[i]+1;
                cnt=1;
            }
        }
        return maxCount;
    }
}
