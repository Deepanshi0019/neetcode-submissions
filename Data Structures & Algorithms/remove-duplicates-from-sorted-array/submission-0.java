class Solution {
    public int removeDuplicates(int[] nums) {
        int fixed = 0;
        int k = 1;
        int j = 1;

        while(j<nums.length){
            if(nums[j]==nums[j-1]){
                j++;

            } // unique element found
            else{
               nums[fixed+1] = nums[j];
               fixed++;
               j++;
               k++;
            }
        }

        return k;
    }
}