class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> dup = new HashSet<>();

        for(int i=0;i<k;i++){
            if(dup.contains(nums[i])){
                return true;
            }
            dup.add(nums[i]);
        }

        for(int i=k;i<nums.length;i++){
            if(dup.contains(nums[i])){
                return true;
            }
            dup.add(nums[i]);
            dup.remove(nums[i-k]);
        }

        return false;
    }
}