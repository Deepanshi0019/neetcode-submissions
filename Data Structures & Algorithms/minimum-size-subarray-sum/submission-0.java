class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int min = Integer.MAX_VALUE;
       int sum =0;
       int low =0;
       int high =0;
       while(high<nums.length){
           sum = sum+nums[high];
           while(sum>=target){
              min = Math.min(min,high-low+1);
              sum= sum-nums[low];
              low++;
           }
           high++;
       }
        if(min==Integer.MAX_VALUE){
            return 0;
        }
       return min;
    }
}